package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to an object's methods and properties. Container access is available through {@link com.sun.star.container.XIndexContainer} , {@link
  * com.sun.star.container.XNameContainer} and {@link com.sun.star.container.XEnumerationAccess} .
  */
@js.native
trait XInvocation extends XInterface {
  
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  val Introspection: XIntrospectionAccess = js.native
  
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  def getIntrospection(): XIntrospectionAccess = js.native
  
  /**
    * returns the value of the property with the specified name.
    * @param aPropertyName specifies the name of the property.
    */
  def getValue(aPropertyName: String): js.Any = js.native
  
  /**
    * returns `TRUE` if the method with the specified name exists, else `FALSE` .
    *
    * This optimizes the calling sequence ( {@link XInvocation.hasMethod()} , {@link XInvocation.invoke()} )!
    * @@param aName        specifies the name of the method.
    */
  def hasMethod(aName: String): Boolean = js.native
  
  /**
    * returns `TRUE` if the property with the specified name exists, else `FALSE` . <p>This optimizes the calling sequence
    *
    *     ( XInvocation::hasProperty(),
    *
    *     XInvocation::getValue() ) or
    *
    *
    *
    *     ( XInvocation::hasProperty(),
    *
    *     XInvocation::setValue() )!
    * @@param aName    specifies the name of the property.
    */
  def hasProperty(aName: String): Boolean = js.native
  
  /**
    * provides access to methods exposed by an object.
    * @param aFunctionName the method to invoke
    * @param aParams all parameters; pure out params are undefined in sequence, the value has to be ignored by the callee
    * @param aOutParamIndex This sequence contains the indices of all parameters that are specified as out or inout.
    * @param aOutParam This sequence contains the values of all parameters that are specified as out or inout and corresponds with the indices provided by the
    */
  def invoke(
    aFunctionName: String,
    aParams: SeqEquiv[_],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[_]]
  ): js.Any = js.native
  
  /**
    * sets a value to the property with the specified name.
    *
    * If the underlying object implements an {@link com.sun.star.container.XNameContainer} , then this method will insert the value if there is no such
    * **aPropertyName** .
    */
  def setValue(aPropertyName: String, aValue: js.Any): Unit = js.native
}
object XInvocation {
  
  @scala.inline
  def apply(
    Introspection: XIntrospectionAccess,
    acquire: () => Unit,
    getIntrospection: () => XIntrospectionAccess,
    getValue: String => js.Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XInvocation]
  }
  
  @scala.inline
  implicit class XInvocationOps[Self <: XInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntrospection(value: XIntrospectionAccess): Self = this.set("Introspection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIntrospection(value: () => XIntrospectionAccess): Self = this.set("getIntrospection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: String => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasMethod(value: String => Boolean): Self = this.set("hasMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasProperty(value: String => Boolean): Self = this.set("hasProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvoke(value: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any): Self = this.set("invoke", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetValue(value: (String, js.Any) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
  }
}
