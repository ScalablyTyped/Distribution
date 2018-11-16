package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXAttributes interface */
@JSGlobal("MSXML2.IVBSAXAttributes")
@js.native
class IVBSAXAttributes protected () extends js.Object {
  var `MSXML2.IVBSAXAttributes_typekey`: IVBSAXAttributes = js.native
  /** Get the number of attributes in the list. */
  val length: scala.Double = js.native
  /** Look up the index of an attribute by Namespace name. */
  def getIndexFromName(strURI: java.lang.String, strLocalName: java.lang.String): scala.Double = js.native
  /** Look up the index of an attribute by XML 1.0 qualified name. */
  def getIndexFromQName(strQName: java.lang.String): scala.Double = js.native
  /** Look up an attribute's local name by index. */
  def getLocalName(nIndex: scala.Double): java.lang.String = js.native
  /** Look up an attribute's XML 1.0 qualified name by index. */
  def getQName(nIndex: scala.Double): java.lang.String = js.native
  /** Look up an attribute's type by index. */
  def getType(nIndex: scala.Double): java.lang.String = js.native
  /** Look up an attribute's type by Namespace name. */
  def getTypeFromName(strURI: java.lang.String, strLocalName: java.lang.String): java.lang.String = js.native
  /** Look up an attribute's type by XML 1.0 qualified name. */
  def getTypeFromQName(strQName: java.lang.String): java.lang.String = js.native
  /** Look up an attribute's Namespace URI by index. */
  def getURI(nIndex: scala.Double): java.lang.String = js.native
  /** Look up an attribute's value by index. */
  def getValue(nIndex: scala.Double): java.lang.String = js.native
  /** Look up an attribute's value by Namespace name. */
  def getValueFromName(strURI: java.lang.String, strLocalName: java.lang.String): java.lang.String = js.native
  /** Look up an attribute's value by XML 1.0 qualified name. */
  def getValueFromQName(strQName: java.lang.String): java.lang.String = js.native
}

