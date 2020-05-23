package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SAX Attributes 6.0 */
@JSGlobal("MSXML2.SAXAttributes60")
@js.native
class SAXAttributes60 protected ()
  extends typings.activexMsxml2.MSXML2.SAXAttributes60 {
  /* CompleteClass */
  @JSName("MSXML2.SAXAttributes60_typekey")
  override var MSXML2DotSAXAttributes60_typekey: typings.activexMsxml2.MSXML2.SAXAttributes60 = js.native
  /** Add an attribute to the end of the list. */
  /* CompleteClass */
  override def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit = js.native
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  /* CompleteClass */
  override def addAttributeFromIndex(varAtts: js.Any, nIndex: Double): Unit = js.native
  /** Clear the attribute list for reuse. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /** Remove an attribute from the list. */
  /* CompleteClass */
  override def removeAttribute(nIndex: Double): Unit = js.native
  /** Set an attribute in the list. */
  /* CompleteClass */
  override def setAttribute(
    nIndex: Double,
    strURI: String,
    strLocalName: String,
    strQName: String,
    strType: String,
    strValue: String
  ): Unit = js.native
  /** Copy an entire Attributes object. */
  /* CompleteClass */
  override def setAttributes(varAtts: js.Any): Unit = js.native
  /** Set the local name of a specific attribute. */
  /* CompleteClass */
  override def setLocalName(nIndex: Double, strLocalName: String): Unit = js.native
  /** Set the qualified name of a specific attribute. */
  /* CompleteClass */
  override def setQName(nIndex: Double, strQName: String): Unit = js.native
  /** Set the type of a specific attribute. */
  /* CompleteClass */
  override def setType(nIndex: Double, strType: String): Unit = js.native
  /** Set the Namespace URI of a specific attribute. */
  /* CompleteClass */
  override def setURI(nIndex: Double, strURI: String): Unit = js.native
  /** Set the value of a specific attribute. */
  /* CompleteClass */
  override def setValue(nIndex: Double, strValue: String): Unit = js.native
}

