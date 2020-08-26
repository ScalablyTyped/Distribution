package typings.angularFileUpload.mod

import typings.angular.mod.IDeferred
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var fn: SyncFilter | AsyncFilter = js.native
  var name: String = js.native
}

object Filter {
  @scala.inline
  def apply(fn: SyncFilter | AsyncFilter, name: String): Filter = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setFnFunction2(value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object]) => Boolean): Self = this.set("fn", js.Any.fromFunction2(value))
    @scala.inline
    def setFnFunction3(
      value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], /* deferred */ IDeferred[js.Any]) => Unit
    ): Self = this.set("fn", js.Any.fromFunction3(value))
    @scala.inline
    def setFn(value: SyncFilter | AsyncFilter): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

