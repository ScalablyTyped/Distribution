package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service provides access to the Macros and Macro containers via the {@link XBrowseNode} interface. {@link XInvocation} is an optional interface
  * that is used to execute macros, or to create/delete/rename macros or macro containers.
  * @since OOo 2.0
  */
trait BrowseNode
  extends XBrowseNode
     with activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XInvocation

object BrowseNode {
  @scala.inline
  def apply(
    ChildNodes: activexDashInteropLib.SafeArray[XBrowseNode],
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    Name: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getChildNodes: js.Function0[activexDashInteropLib.SafeArray[XBrowseNode]],
    getIntrospection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess],
    getName: js.Function0[java.lang.String],
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
  ): BrowseNode = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Introspection = Introspection, Name = Name, Type = Type, acquire = acquire, getChildNodes = getChildNodes, getIntrospection = getIntrospection, getName = getName, getType = getType, getValue = getValue, hasChildNodes = hasChildNodes, hasMethod = hasMethod, hasProperty = hasProperty, invoke = invoke, queryInterface = queryInterface, release = release, setValue = setValue)
  
    __obj.asInstanceOf[BrowseNode]
  }
}

