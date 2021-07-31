package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLSelectionObject extends StObject {
  
  @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject
  
  def clear(): Unit
  
  def createRange(): js.Any
  
  def empty(): Unit
  
  val `type`: String
}
object IHTMLSelectionObject {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: () => Unit,
    createRange: () => js.Any,
    empty: () => Unit,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), createRange = js.Any.fromFunction0(createRange), empty = js.Any.fromFunction0(empty))
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
  
  @scala.inline
  implicit class IHTMLSelectionObjectMutableBuilder[Self <: IHTMLSelectionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateRange(value: () => js.Any): Self = StObject.set(x, "createRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotIHTMLSelectionObject_typekey(value: IHTMLSelectionObject): Self = StObject.set(x, "MSHTML.IHTMLSelectionObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
