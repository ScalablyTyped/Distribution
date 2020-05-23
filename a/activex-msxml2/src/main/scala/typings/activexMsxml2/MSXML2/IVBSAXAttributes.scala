package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXAttributes interface */
trait IVBSAXAttributes extends js.Object {
  @JSName("MSXML2.IVBSAXAttributes_typekey")
  var MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes
  /** Get the number of attributes in the list. */
  val length: Double
  /** Look up the index of an attribute by Namespace name. */
  def getIndexFromName(strURI: String, strLocalName: String): Double
  /** Look up the index of an attribute by XML 1.0 qualified name. */
  def getIndexFromQName(strQName: String): Double
  /** Look up an attribute's local name by index. */
  def getLocalName(nIndex: Double): String
  /** Look up an attribute's XML 1.0 qualified name by index. */
  def getQName(nIndex: Double): String
  /** Look up an attribute's type by index. */
  def getType(nIndex: Double): String
  /** Look up an attribute's type by Namespace name. */
  def getTypeFromName(strURI: String, strLocalName: String): String
  /** Look up an attribute's type by XML 1.0 qualified name. */
  def getTypeFromQName(strQName: String): String
  /** Look up an attribute's Namespace URI by index. */
  def getURI(nIndex: Double): String
  /** Look up an attribute's value by index. */
  def getValue(nIndex: Double): String
  /** Look up an attribute's value by Namespace name. */
  def getValueFromName(strURI: String, strLocalName: String): String
  /** Look up an attribute's value by XML 1.0 qualified name. */
  def getValueFromQName(strQName: String): String
}

object IVBSAXAttributes {
  @scala.inline
  def apply(
    MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes,
    getIndexFromName: (String, String) => Double,
    getIndexFromQName: String => Double,
    getLocalName: Double => String,
    getQName: Double => String,
    getType: Double => String,
    getTypeFromName: (String, String) => String,
    getTypeFromQName: String => String,
    getURI: Double => String,
    getValue: Double => String,
    getValueFromName: (String, String) => String,
    getValueFromQName: String => String,
    length: Double
  ): IVBSAXAttributes = {
    val __obj = js.Dynamic.literal(getIndexFromName = js.Any.fromFunction2(getIndexFromName), getIndexFromQName = js.Any.fromFunction1(getIndexFromQName), getLocalName = js.Any.fromFunction1(getLocalName), getQName = js.Any.fromFunction1(getQName), getType = js.Any.fromFunction1(getType), getTypeFromName = js.Any.fromFunction2(getTypeFromName), getTypeFromQName = js.Any.fromFunction1(getTypeFromQName), getURI = js.Any.fromFunction1(getURI), getValue = js.Any.fromFunction1(getValue), getValueFromName = js.Any.fromFunction2(getValueFromName), getValueFromQName = js.Any.fromFunction1(getValueFromQName), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IVBSAXAttributes_typekey")(MSXML2DotIVBSAXAttributes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXAttributes]
  }
}

