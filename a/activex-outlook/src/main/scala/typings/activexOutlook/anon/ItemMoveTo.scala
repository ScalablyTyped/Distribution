package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemMoveTo extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Item: js.Any = js.native
  
  val MoveTo: typings.activexOutlook.Outlook.Folder = js.native
}
object ItemMoveTo {
  
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: typings.activexOutlook.Outlook.Folder): ItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveTo]
  }
  
  @scala.inline
  implicit class ItemMoveToMutableBuilder[Self <: ItemMoveTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTo(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "MoveTo", value.asInstanceOf[js.Any])
  }
}
