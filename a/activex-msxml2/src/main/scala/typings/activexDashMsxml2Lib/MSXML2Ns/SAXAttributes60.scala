package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SAX Attributes 6.0 */
@JSGlobal("MSXML2.SAXAttributes60")
@js.native
class SAXAttributes60 protected () extends js.Object {
  var `MSXML2.SAXAttributes60_typekey`: SAXAttributes60 = js.native
  /** Add an attribute to the end of the list. */
  def addAttribute(
    strURI: java.lang.String,
    strLocalName: java.lang.String,
    strQName: java.lang.String,
    strType: java.lang.String,
    strValue: java.lang.String
  ): scala.Unit = js.native
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: js.Any, nIndex: scala.Double): scala.Unit = js.native
  /** Clear the attribute list for reuse. */
  def clear(): scala.Unit = js.native
  /** Remove an attribute from the list. */
  def removeAttribute(nIndex: scala.Double): scala.Unit = js.native
  /** Set an attribute in the list. */
  def setAttribute(
    nIndex: scala.Double,
    strURI: java.lang.String,
    strLocalName: java.lang.String,
    strQName: java.lang.String,
    strType: java.lang.String,
    strValue: java.lang.String
  ): scala.Unit = js.native
  /** Copy an entire Attributes object. */
  def setAttributes(varAtts: js.Any): scala.Unit = js.native
  /** Set the local name of a specific attribute. */
  def setLocalName(nIndex: scala.Double, strLocalName: java.lang.String): scala.Unit = js.native
  /** Set the qualified name of a specific attribute. */
  def setQName(nIndex: scala.Double, strQName: java.lang.String): scala.Unit = js.native
  /** Set the type of a specific attribute. */
  def setType(nIndex: scala.Double, strType: java.lang.String): scala.Unit = js.native
  /** Set the Namespace URI of a specific attribute. */
  def setURI(nIndex: scala.Double, strURI: java.lang.String): scala.Unit = js.native
  /** Set the value of a specific attribute. */
  def setValue(nIndex: scala.Double, strValue: java.lang.String): scala.Unit = js.native
}

