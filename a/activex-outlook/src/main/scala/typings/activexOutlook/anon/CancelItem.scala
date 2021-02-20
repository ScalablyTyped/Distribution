package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelItem extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Item: js.Any = js.native
}
object CancelItem {
  
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any): CancelItem = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelItem]
  }
  
  @scala.inline
  implicit class CancelItemMutableBuilder[Self <: CancelItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
