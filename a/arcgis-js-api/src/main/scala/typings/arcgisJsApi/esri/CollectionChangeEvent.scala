package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChangeEvent[T] extends js.Object {
  var added: js.Array[T] = js.native
  var moved: js.Array[T] = js.native
  var removed: js.Array[T] = js.native
}

object CollectionChangeEvent {
  @scala.inline
  def apply[T](added: js.Array[T], moved: js.Array[T], removed: js.Array[T]): CollectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], moved = moved.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChangeEvent[T]]
  }
  @scala.inline
  implicit class CollectionChangeEventOps[Self <: CollectionChangeEvent[_], T] (val x: Self with CollectionChangeEvent[T]) extends AnyVal {
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
    def setAddedVarargs(value: T*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[T]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovedVarargs(value: T*): Self = this.set("moved", js.Array(value :_*))
    @scala.inline
    def setMoved(value: js.Array[T]): Self = this.set("moved", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: T*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[T]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

