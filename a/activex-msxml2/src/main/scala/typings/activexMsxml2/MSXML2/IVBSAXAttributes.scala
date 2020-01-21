package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXAttributes interface */
@JSGlobal("MSXML2.IVBSAXAttributes")
@js.native
class IVBSAXAttributes protected () extends js.Object {
  @JSName("MSXML2.IVBSAXAttributes_typekey")
  var MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes = js.native
  /** Get the number of attributes in the list. */
  val length: Double = js.native
  /** Look up the index of an attribute by Namespace name. */
  def getIndexFromName(strURI: String, strLocalName: String): Double = js.native
  /** Look up the index of an attribute by XML 1.0 qualified name. */
  def getIndexFromQName(strQName: String): Double = js.native
  /** Look up an attribute's local name by index. */
  def getLocalName(nIndex: Double): String = js.native
  /** Look up an attribute's XML 1.0 qualified name by index. */
  def getQName(nIndex: Double): String = js.native
  /** Look up an attribute's type by index. */
  def getType(nIndex: Double): String = js.native
  /** Look up an attribute's type by Namespace name. */
  def getTypeFromName(strURI: String, strLocalName: String): String = js.native
  /** Look up an attribute's type by XML 1.0 qualified name. */
  def getTypeFromQName(strQName: String): String = js.native
  /** Look up an attribute's Namespace URI by index. */
  def getURI(nIndex: Double): String = js.native
  /** Look up an attribute's value by index. */
  def getValue(nIndex: Double): String = js.native
  /** Look up an attribute's value by Namespace name. */
  def getValueFromName(strURI: String, strLocalName: String): String = js.native
  /** Look up an attribute's value by XML 1.0 qualified name. */
  def getValueFromQName(strQName: String): String = js.native
}

