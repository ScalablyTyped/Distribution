package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ViewObject")
@js.native
class ViewObject protected () extends js.Object {
  var `InfoPath.ViewObject_typekey`: ViewObject = js.native
  val Name: java.lang.String = js.native
  val Window: Window = js.native
  def DisableAutoUpdate(): scala.Unit = js.native
  def EnableAutoUpdate(): scala.Unit = js.native
  def ExecuteAction(bstrAction: java.lang.String): scala.Unit = js.native
  def ExecuteAction(bstrAction: java.lang.String, varXmlToEdit: js.Any): scala.Unit = js.native
  def Export(bstrURL: java.lang.String, bstrFormat: java.lang.String): scala.Unit = js.native
  def ForceUpdate(): scala.Unit = js.native
  def GetContextNodes(): XMLNodesCollection = js.native
  def GetContextNodes(varNode: js.Any): XMLNodesCollection = js.native
  def GetContextNodes(varNode: js.Any, varViewContext: js.Any): XMLNodesCollection = js.native
  def GetSelectedNodes(): XMLNodesCollection = js.native
  def SelectNodes(pxnStartNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode): scala.Unit = js.native
  def SelectNodes(pxnStartNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode, varEndNode: js.Any): scala.Unit = js.native
  def SelectNodes(
    pxnStartNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode,
    varEndNode: js.Any,
    varViewContext: js.Any
  ): scala.Unit = js.native
  def SelectText(pxnField: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode): scala.Unit = js.native
  def SelectText(pxnField: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode, varViewContext: js.Any): scala.Unit = js.native
  def SwitchView(bstrName: java.lang.String): scala.Unit = js.native
}

