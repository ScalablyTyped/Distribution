package typings.arcgisJsApi.anon

import typings.arcgisJsApi.esri.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items[T /* <: Base */, Base] extends js.Object {
  
  var items: js.UndefOr[js.Array[T] | Collection[T]] = js.native
}
object Items {
  
  @scala.inline
  def apply[T /* <: Base */, Base](): Items[T, Base] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items[T, Base]]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items[_, _], T /* <: Base */, Base] (val x: Self with (Items[T, Base])) extends AnyVal {
    
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
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T] | Collection[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
