package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAutomationInvocation
  extends StObject
     with XInvocation {
  
  def invokeGetProperty(
    aFunctionName: String,
    aParams: SeqEquiv[js.Any],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[js.Any]]
  ): js.Any
  
  def invokePutProperty(
    aFunctionName: String,
    aParams: SeqEquiv[js.Any],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[js.Any]]
  ): js.Any
}
object XAutomationInvocation {
  
  @scala.inline
  def apply(
    Introspection: XIntrospectionAccess,
    acquire: () => Unit,
    getIntrospection: () => XIntrospectionAccess,
    getValue: String => js.Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[js.Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[js.Any]]) => js.Any,
    invokeGetProperty: (String, SeqEquiv[js.Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[js.Any]]) => js.Any,
    invokePutProperty: (String, SeqEquiv[js.Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[js.Any]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), invokeGetProperty = js.Any.fromFunction4(invokeGetProperty), invokePutProperty = js.Any.fromFunction4(invokePutProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XAutomationInvocation]
  }
  
  @scala.inline
  implicit class XAutomationInvocationMutableBuilder[Self <: XAutomationInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvokeGetProperty(
      value: (String, SeqEquiv[js.Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[js.Any]]) => js.Any
    ): Self = StObject.set(x, "invokeGetProperty", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInvokePutProperty(
      value: (String, SeqEquiv[js.Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[js.Any]]) => js.Any
    ): Self = StObject.set(x, "invokePutProperty", js.Any.fromFunction4(value))
  }
}
