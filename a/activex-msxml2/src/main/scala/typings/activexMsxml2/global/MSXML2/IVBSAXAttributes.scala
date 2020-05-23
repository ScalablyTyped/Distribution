package typings.activexMsxml2.global.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXAttributes interface */
@JSGlobal("MSXML2.IVBSAXAttributes")
@js.native
class IVBSAXAttributes protected ()
  extends typings.activexMsxml2.MSXML2.IVBSAXAttributes {
  /* CompleteClass */
  @JSName("MSXML2.IVBSAXAttributes_typekey")
  override var MSXML2DotIVBSAXAttributes_typekey: typings.activexMsxml2.MSXML2.IVBSAXAttributes = js.native
  /** Get the number of attributes in the list. */
  /* CompleteClass */
  override val length: Double = js.native
  /** Look up the index of an attribute by Namespace name. */
  /* CompleteClass */
  override def getIndexFromName(strURI: String, strLocalName: String): Double = js.native
  /** Look up the index of an attribute by XML 1.0 qualified name. */
  /* CompleteClass */
  override def getIndexFromQName(strQName: String): Double = js.native
  /** Look up an attribute's local name by index. */
  /* CompleteClass */
  override def getLocalName(nIndex: Double): String = js.native
  /** Look up an attribute's XML 1.0 qualified name by index. */
  /* CompleteClass */
  override def getQName(nIndex: Double): String = js.native
  /** Look up an attribute's type by index. */
  /* CompleteClass */
  override def getType(nIndex: Double): String = js.native
  /** Look up an attribute's type by Namespace name. */
  /* CompleteClass */
  override def getTypeFromName(strURI: String, strLocalName: String): String = js.native
  /** Look up an attribute's type by XML 1.0 qualified name. */
  /* CompleteClass */
  override def getTypeFromQName(strQName: String): String = js.native
  /** Look up an attribute's Namespace URI by index. */
  /* CompleteClass */
  override def getURI(nIndex: Double): String = js.native
  /** Look up an attribute's value by index. */
  /* CompleteClass */
  override def getValue(nIndex: Double): String = js.native
  /** Look up an attribute's value by Namespace name. */
  /* CompleteClass */
  override def getValueFromName(strURI: String, strLocalName: String): String = js.native
  /** Look up an attribute's value by XML 1.0 qualified name. */
  /* CompleteClass */
  override def getValueFromQName(strQName: String): String = js.native
}

