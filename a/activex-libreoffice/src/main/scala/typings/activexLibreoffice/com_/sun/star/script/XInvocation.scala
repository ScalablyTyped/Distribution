package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to an object's methods and properties. Container access is available through {@link com.sun.star.container.XIndexContainer} , {@link
  * com.sun.star.container.XNameContainer} and {@link com.sun.star.container.XEnumerationAccess} .
  */
trait XInvocation
  extends StObject
     with XInterface {
  
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  val Introspection: XIntrospectionAccess
  
  /** returns the introspection from this object or `NULL` if the object does not provide this information. */
  def getIntrospection(): XIntrospectionAccess
  
  /**
    * returns the value of the property with the specified name.
    * @param aPropertyName specifies the name of the property.
    */
  def getValue(aPropertyName: String): Any
  
  /**
    * returns `TRUE` if the method with the specified name exists, else `FALSE` .
    *
    * This optimizes the calling sequence ( {@link XInvocation.hasMethod()} , {@link XInvocation.invoke()} )!
    * @@param aName        specifies the name of the method.
    */
  def hasMethod(aName: String): Boolean
  
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
  def hasProperty(aName: String): Boolean
  
  /**
    * provides access to methods exposed by an object.
    * @param aFunctionName the method to invoke
    * @param aParams all parameters; pure out params are undefined in sequence, the value has to be ignored by the callee
    * @param aOutParamIndex This sequence contains the indices of all parameters that are specified as out or inout.
    * @param aOutParam This sequence contains the values of all parameters that are specified as out or inout and corresponds with the indices provided by the
    */
  def invoke(
    aFunctionName: String,
    aParams: SeqEquiv[Any],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[Any]]
  ): Any
  
  /**
    * sets a value to the property with the specified name.
    *
    * If the underlying object implements an {@link com.sun.star.container.XNameContainer} , then this method will insert the value if there is no such
    * **aPropertyName** .
    */
  def setValue(aPropertyName: String, aValue: Any): Unit
}
object XInvocation {
  
  inline def apply(
    Introspection: XIntrospectionAccess,
    acquire: () => Unit,
    getIntrospection: () => XIntrospectionAccess,
    getValue: String => Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setValue: (String, Any) => Unit
  ): XInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XInvocation]
  }
  
  extension [Self <: XInvocation](x: Self) {
    
    inline def setGetIntrospection(value: () => XIntrospectionAccess): Self = StObject.set(x, "getIntrospection", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: String => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setHasMethod(value: String => Boolean): Self = StObject.set(x, "hasMethod", js.Any.fromFunction1(value))
    
    inline def setHasProperty(value: String => Boolean): Self = StObject.set(x, "hasProperty", js.Any.fromFunction1(value))
    
    inline def setIntrospection(value: XIntrospectionAccess): Self = StObject.set(x, "Introspection", value.asInstanceOf[js.Any])
    
    inline def setInvoke(value: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invoke", js.Any.fromFunction4(value))
    
    inline def setSetValue(value: (String, Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
