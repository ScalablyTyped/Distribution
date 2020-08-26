package typings.angularCore.testingTestingMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataOverride[T] extends js.Object {
  var add: js.UndefOr[Partial[T]] = js.native
  var remove: js.UndefOr[Partial[T]] = js.native
  var set: js.UndefOr[Partial[T]] = js.native
}

object MetadataOverride {
  @scala.inline
  def apply[T](): MetadataOverride[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOverride[T]]
  }
  @scala.inline
  implicit class MetadataOverrideOps[Self <: MetadataOverride[_], T] (val x: Self with MetadataOverride[T]) extends AnyVal {
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
    def setAdd(value: Partial[T]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setRemove(value: Partial[T]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSet(value: Partial[T]): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

