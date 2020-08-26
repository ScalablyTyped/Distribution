package typings.avoscloudSdk.mod.Op

import typings.avoscloudSdk.mod.IBaseObject
import typings.avoscloudSdk.mod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relation extends IBaseObject {
  var removed: js.Array[Object] = js.native
  def added(): js.Array[Object] = js.native
}

object Relation {
  @scala.inline
  def apply(added: () => js.Array[Object], removed: js.Array[Object], toJSON: () => js.Any): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Relation]
  }
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
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
    def setAdded(value: () => js.Array[Object]): Self = this.set("added", js.Any.fromFunction0(value))
    @scala.inline
    def setRemovedVarargs(value: Object*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[Object]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

