package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SAX Attributes 6.0 */
trait SAXAttributes60 extends StObject {
  
  /* private */ @JSName("MSXML2.SAXAttributes60_typekey")
  var MSXML2DotSAXAttributes60_typekey: SAXAttributes60
  
  /** Add an attribute to the end of the list. */
  def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit
  
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: Any, nIndex: Double): Unit
  
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
  def setAttributes(varAtts: Any): Unit
  
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
  
  inline def apply(
    MSXML2DotSAXAttributes60_typekey: SAXAttributes60,
    addAttribute: (String, String, String, String, String) => Unit,
    addAttributeFromIndex: (Any, Double) => Unit,
    clear: () => Unit,
    removeAttribute: Double => Unit,
    setAttribute: (Double, String, String, String, String, String) => Unit,
    setAttributes: Any => Unit,
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
  
  extension [Self <: SAXAttributes60](x: Self) {
    
    inline def setAddAttribute(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "addAttribute", js.Any.fromFunction5(value))
    
    inline def setAddAttributeFromIndex(value: (Any, Double) => Unit): Self = StObject.set(x, "addAttributeFromIndex", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setMSXML2DotSAXAttributes60_typekey(value: SAXAttributes60): Self = StObject.set(x, "MSXML2.SAXAttributes60_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttribute(value: Double => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    inline def setSetAttribute(value: (Double, String, String, String, String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction6(value))
    
    inline def setSetAttributes(value: Any => Unit): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
    
    inline def setSetLocalName(value: (Double, String) => Unit): Self = StObject.set(x, "setLocalName", js.Any.fromFunction2(value))
    
    inline def setSetQName(value: (Double, String) => Unit): Self = StObject.set(x, "setQName", js.Any.fromFunction2(value))
    
    inline def setSetType(value: (Double, String) => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction2(value))
    
    inline def setSetURI(value: (Double, String) => Unit): Self = StObject.set(x, "setURI", js.Any.fromFunction2(value))
    
    inline def setSetValue(value: (Double, String) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
