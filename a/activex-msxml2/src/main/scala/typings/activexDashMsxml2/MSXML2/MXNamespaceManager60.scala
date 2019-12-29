package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** MX Namespace Manager 6.0 */
@JSGlobal("MSXML2.MXNamespaceManager60")
@js.native
class MXNamespaceManager60 protected () extends js.Object {
  @JSName("MSXML2.MXNamespaceManager60_typekey")
  var MSXML2DotMXNamespaceManager60_typekey: MXNamespaceManager60 = js.native
  var allowOverride: Boolean = js.native
  def declarePrefix(prefix: String, namespaceURI: String): Unit = js.native
  def getDeclaredPrefixes(): IMXNamespacePrefixes = js.native
  def getPrefixes(namespaceURI: String): IMXNamespacePrefixes = js.native
  def getURI(prefix: String): js.Any = js.native
  def getURIFromNode(strPrefix: String, contextNode: IXMLDOMNode): js.Any = js.native
  def popContext(): Unit = js.native
  def pushContext(): Unit = js.native
  /** @param fDeep [fDeep=true] */
  def pushNodeContext(contextNode: IXMLDOMNode): Unit = js.native
  def pushNodeContext(contextNode: IXMLDOMNode, fDeep: Boolean): Unit = js.native
  def reset(): Unit = js.native
}

