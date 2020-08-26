package typings.apolloCache.typesCacheMod.Cache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffResult[T] extends js.Object {
  var complete: js.UndefOr[Boolean] = js.native
  var result: js.UndefOr[T] = js.native
}

object DiffResult {
  @scala.inline
  def apply[T](): DiffResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffResult[T]]
  }
  @scala.inline
  implicit class DiffResultOps[Self <: DiffResult[_], T] (val x: Self with DiffResult[T]) extends AnyVal {
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
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

