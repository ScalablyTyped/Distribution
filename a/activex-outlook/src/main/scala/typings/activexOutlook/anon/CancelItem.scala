package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelItem extends StObject {
  
  var Cancel: Boolean
  
  val Item: Any
}
object CancelItem {
  
  inline def apply(Cancel: Boolean, Item: Any): CancelItem = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelItem]
  }
  
  extension [Self <: CancelItem](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
