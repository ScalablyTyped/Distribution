package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemMoveTo extends StObject {
  
  var Cancel: Boolean
  
  val Item: Any
  
  val MoveTo: typings.activexOutlook.Outlook.Folder
}
object ItemMoveTo {
  
  inline def apply(Cancel: Boolean, Item: Any, MoveTo: typings.activexOutlook.Outlook.Folder): ItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemMoveTo] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "MoveTo", value.asInstanceOf[js.Any])
  }
}
