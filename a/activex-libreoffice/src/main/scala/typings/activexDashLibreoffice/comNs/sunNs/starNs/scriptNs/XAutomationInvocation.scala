package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XIntrospectionAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAutomationInvocation extends XInvocation {
  def invokeGetProperty(
    aFunctionName: String,
    aParams: SeqEquiv[_],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[_]]
  ): js.Any
  def invokePutProperty(
    aFunctionName: String,
    aParams: SeqEquiv[_],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[_]]
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
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    invokeGetProperty: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    invokePutProperty: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection, acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), invokeGetProperty = js.Any.fromFunction4(invokeGetProperty), invokePutProperty = js.Any.fromFunction4(invokePutProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XAutomationInvocation]
  }
}

