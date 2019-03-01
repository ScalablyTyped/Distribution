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
    acquire: js.Function0[scala.Unit],
    getIntrospection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess],
    getValue: js.Function1[java.lang.String, js.Any],
    hasMethod: js.Function1[java.lang.String, scala.Boolean],
    hasProperty: js.Function1[java.lang.String, scala.Boolean],
    invoke: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      js.Any
    ],
    invokeGetProperty: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      js.Any
    ],
    invokePutProperty: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Introspection")(Introspection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getIntrospection")(getIntrospection)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("hasMethod")(hasMethod)
    __obj.updateDynamic("hasProperty")(hasProperty)
    __obj.updateDynamic("invoke")(invoke)
    __obj.updateDynamic("invokeGetProperty")(invokeGetProperty)
    __obj.updateDynamic("invokePutProperty")(invokePutProperty)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[XAutomationInvocation]
  }
}

