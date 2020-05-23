package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SAX Attributes 6.0 */
trait SAXAttributes60 extends js.Object {
  @JSName("MSXML2.SAXAttributes60_typekey")
  var MSXML2DotSAXAttributes60_typekey: SAXAttributes60
  /** Add an attribute to the end of the list. */
  def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: js.Any, nIndex: Double): Unit
  /** Clear the attribute list for reuse. */
  def clear(): Unit
  /** Remove an attribute from the list. */
  def removeAttribute(nIndex: Double): Unit
  /** Set an attribute in the list. */
  def setAttribute(
    nIndex: Double,
    strURI: String,
    strLocalName: String,
    strQName: String,
    strType: String,
    strValue: String
  ): Unit
  /** Copy an entire Attributes object. */
  def setAttributes(varAtts: js.Any): Unit
  /** Set the local name of a specific attribute. */
  def setLocalName(nIndex: Double, strLocalName: String): Unit
  /** Set the qualified name of a specific attribute. */
  def setQName(nIndex: Double, strQName: String): Unit
  /** Set the type of a specific attribute. */
  def setType(nIndex: Double, strType: String): Unit
  /** Set the Namespace URI of a specific attribute. */
  def setURI(nIndex: Double, strURI: String): Unit
  /** Set the value of a specific attribute. */
  def setValue(nIndex: Double, strValue: String): Unit
}

object SAXAttributes60 {
  @scala.inline
  def apply(
    MSXML2DotSAXAttributes60_typekey: SAXAttributes60,
    addAttribute: (String, String, String, String, String) => Unit,
    addAttributeFromIndex: (js.Any, Double) => Unit,
    clear: () => Unit,
    removeAttribute: Double => Unit,
    setAttribute: (Double, String, String, String, String, String) => Unit,
    setAttributes: js.Any => Unit,
    setLocalName: (Double, String) => Unit,
    setQName: (Double, String) => Unit,
    setType: (Double, String) => Unit,
    setURI: (Double, String) => Unit,
    setValue: (Double, String) => Unit
  ): SAXAttributes60 = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction5(addAttribute), addAttributeFromIndex = js.Any.fromFunction2(addAttributeFromIndex), clear = js.Any.fromFunction0(clear), removeAttribute = js.Any.fromFunction1(removeAttribute), setAttribute = js.Any.fromFunction6(setAttribute), setAttributes = js.Any.fromFunction1(setAttributes), setLocalName = js.Any.fromFunction2(setLocalName), setQName = js.Any.fromFunction2(setQName), setType = js.Any.fromFunction2(setType), setURI = js.Any.fromFunction2(setURI), setValue = js.Any.fromFunction2(setValue))
    __obj.updateDynamic("MSXML2.SAXAttributes60_typekey")(MSXML2DotSAXAttributes60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXAttributes60]
  }
}

