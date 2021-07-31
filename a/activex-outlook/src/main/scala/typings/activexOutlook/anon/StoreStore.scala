package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreStore extends StObject {
  
  val Store: typings.activexOutlook.Outlook.Store
}
object StoreStore {
  
  @scala.inline
  def apply(Store: typings.activexOutlook.Outlook.Store): StoreStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreStore]
  }
  
  @scala.inline
  implicit class StoreStoreMutableBuilder[Self <: StoreStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore(value: typings.activexOutlook.Outlook.Store): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
