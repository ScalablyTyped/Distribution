package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLSelectionObject extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject
  
  def clear(): Unit
  
  def createRange(): Any
  
  def empty(): Unit
  
  val `type`: String
}
object IHTMLSelectionObject {
  
  inline def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: () => Unit,
    createRange: () => Any,
    empty: () => Unit,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), createRange = js.Any.fromFunction0(createRange), empty = js.Any.fromFunction0(empty))
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
  
  extension [Self <: IHTMLSelectionObject](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setCreateRange(value: () => Any): Self = StObject.set(x, "createRange", js.Any.fromFunction0(value))
    
    inline def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    inline def setMSHTMLDotIHTMLSelectionObject_typekey(value: IHTMLSelectionObject): Self = StObject.set(x, "MSHTML.IHTMLSelectionObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
