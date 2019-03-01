package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service providers a means to browse and execute scripts. */
trait ScriptProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNode
     with XScriptProvider

object ScriptProvider {
  @scala.inline
  def apply(
    ChildNodes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.XBrowseNode],
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    Name: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getChildNodes: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.XBrowseNode]
    ],
    getIntrospection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess],
    getName: js.Function0[java.lang.String],
    getScript: js.Function1[java.lang.String, XScript],
    getType: js.Function0[scala.Double],
    getValue: js.Function1[java.lang.String, js.Any],
    hasChildNodes: js.Function0[scala.Boolean],
    hasMethod: js.Function1[java.lang.String, scala.Boolean],
    hasProperty: js.Function1[java.lang.String, scala.Boolean],
    invoke: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ScriptProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChildNodes")(ChildNodes)
    __obj.updateDynamic("Introspection")(Introspection)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getChildNodes")(getChildNodes)
    __obj.updateDynamic("getIntrospection")(getIntrospection)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getScript")(getScript)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("hasMethod")(hasMethod)
    __obj.updateDynamic("hasProperty")(hasProperty)
    __obj.updateDynamic("invoke")(invoke)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[ScriptProvider]
  }
}

