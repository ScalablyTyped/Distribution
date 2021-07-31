package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStore extends StObject {
  
  var Cancel: Boolean
  
  val Store: typings.activexOutlook.Outlook.Store
}
object CancelStore {
  
  @scala.inline
  def apply(Cancel: Boolean, Store: typings.activexOutlook.Outlook.Store): CancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStore]
  }
  
  @scala.inline
  implicit class CancelStoreMutableBuilder[Self <: CancelStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: typings.activexOutlook.Outlook.Store): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
