package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAutomationInvocation extends XInvocation {
  def invokeGetProperty(
    aFunctionName: java.lang.String,
    aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    aOutParamIndex: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    aOutParam: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): js.Any
  def invokePutProperty(
    aFunctionName: java.lang.String,
    aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    aOutParamIndex: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    aOutParam: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): js.Any
}

object XAutomationInvocation {
  @scala.inline
  def apply(
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    acquire: () => scala.Unit,
    getIntrospection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    getValue: java.lang.String => js.Any,
    hasMethod: java.lang.String => scala.Boolean,
    hasProperty: java.lang.String => scala.Boolean,
    invoke: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    invokeGetProperty: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    invokePutProperty: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValue: (java.lang.String, js.Any) => scala.Unit
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection, acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), invokeGetProperty = js.Any.fromFunction4(invokeGetProperty), invokePutProperty = js.Any.fromFunction4(invokePutProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XAutomationInvocation]
  }
}

