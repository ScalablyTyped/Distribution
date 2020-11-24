package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXAttributes interface */
@js.native
trait IVBSAXAttributes extends js.Object {
  
  @JSName("MSXML2.IVBSAXAttributes_typekey")
  var MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes = js.native
  
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
  
  /** Get the number of attributes in the list. */
  val length: Double = js.native
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
  
  @scala.inline
  implicit class IVBSAXAttributesOps[Self <: IVBSAXAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSXML2DotIVBSAXAttributes_typekey(value: IVBSAXAttributes): Self = this.set("MSXML2.IVBSAXAttributes_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIndexFromName(value: (String, String) => Double): Self = this.set("getIndexFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIndexFromQName(value: String => Double): Self = this.set("getIndexFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalName(value: Double => String): Self = this.set("getLocalName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetQName(value: Double => String): Self = this.set("getQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetType(value: Double => String): Self = this.set("getType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeFromName(value: (String, String) => String): Self = this.set("getTypeFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTypeFromQName(value: String => String): Self = this.set("getTypeFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetURI(value: Double => String): Self = this.set("getURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: Double => String): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueFromName(value: (String, String) => String): Self = this.set("getValueFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueFromQName(value: String => String): Self = this.set("getValueFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
