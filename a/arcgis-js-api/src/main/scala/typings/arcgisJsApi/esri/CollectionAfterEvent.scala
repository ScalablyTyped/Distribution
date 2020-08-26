package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionAfterEvent[T] extends js.Object {
  var item: T = js.native
}

object CollectionAfterEvent {
  @scala.inline
  def apply[T](item: T): CollectionAfterEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAfterEvent[T]]
  }
  @scala.inline
  implicit class CollectionAfterEventOps[Self <: CollectionAfterEvent[_], T] (val x: Self with CollectionAfterEvent[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

