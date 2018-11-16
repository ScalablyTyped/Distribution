package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** MX Namespace Manager 6.0 */
@JSGlobal("MSXML2.MXNamespaceManager60")
@js.native
class MXNamespaceManager60 protected () extends js.Object {
  var `MSXML2.MXNamespaceManager60_typekey`: MXNamespaceManager60 = js.native
  var allowOverride: scala.Boolean = js.native
  def declarePrefix(prefix: java.lang.String, namespaceURI: java.lang.String): scala.Unit = js.native
  def getDeclaredPrefixes(): IMXNamespacePrefixes = js.native
  def getPrefixes(namespaceURI: java.lang.String): IMXNamespacePrefixes = js.native
  def getURI(prefix: java.lang.String): js.Any = js.native
  def getURIFromNode(strPrefix: java.lang.String, contextNode: IXMLDOMNode): js.Any = js.native
  def popContext(): scala.Unit = js.native
  def pushContext(): scala.Unit = js.native
  /** @param fDeep [fDeep=true] */
  def pushNodeContext(contextNode: IXMLDOMNode): scala.Unit = js.native
  /** @param fDeep [fDeep=true] */
  def pushNodeContext(contextNode: IXMLDOMNode, fDeep: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

