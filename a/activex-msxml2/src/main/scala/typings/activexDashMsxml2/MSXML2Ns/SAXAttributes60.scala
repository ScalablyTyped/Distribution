package typings.activexDashMsxml2.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SAX Attributes 6.0 */
@JSGlobal("MSXML2.SAXAttributes60")
@js.native
class SAXAttributes60 protected () extends js.Object {
  var `MSXML2.SAXAttributes60_typekey`: SAXAttributes60 = js.native
  /** Add an attribute to the end of the list. */
  def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit = js.native
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: js.Any, nIndex: Double): Unit = js.native
  /** Clear the attribute list for reuse. */
  def clear(): Unit = js.native
  /** Remove an attribute from the list. */
  def removeAttribute(nIndex: Double): Unit = js.native
  /** Set an attribute in the list. */
  def setAttribute(
    nIndex: Double,
    strURI: String,
    strLocalName: String,
    strQName: String,
    strType: String,
    strValue: String
  ): Unit = js.native
  /** Copy an entire Attributes object. */
  def setAttributes(varAtts: js.Any): Unit = js.native
  /** Set the local name of a specific attribute. */
  def setLocalName(nIndex: Double, strLocalName: String): Unit = js.native
  /** Set the qualified name of a specific attribute. */
  def setQName(nIndex: Double, strQName: String): Unit = js.native
  /** Set the type of a specific attribute. */
  def setType(nIndex: Double, strType: String): Unit = js.native
  /** Set the Namespace URI of a specific attribute. */
  def setURI(nIndex: Double, strURI: String): Unit = js.native
  /** Set the value of a specific attribute. */
  def setValue(nIndex: Double, strValue: String): Unit = js.native
}

