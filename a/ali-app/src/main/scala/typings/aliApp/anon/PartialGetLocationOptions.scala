package typings.aliApp.anon

import typings.aliApp.aliAppNumbers.`0`
import typings.aliApp.aliAppNumbers.`1`
import typings.aliApp.aliAppNumbers.`2`
import typings.aliApp.aliAppNumbers.`3`
import typings.aliApp.my.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.GetLocationOptions> */
@js.native
trait PartialGetLocationOptions extends js.Object {
  var cacheTimeout: js.UndefOr[Double] = js.native
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.native
  var `type`: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
}

object PartialGetLocationOptions {
  @scala.inline
  def apply(): PartialGetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetLocationOptions]
  }
  @scala.inline
  implicit class PartialGetLocationOptionsOps[Self <: PartialGetLocationOptions] (val x: Self) extends AnyVal {
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
    def setCacheTimeout(value: Double): Self = this.set("cacheTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTimeout: Self = this.set("cacheTimeout", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ LocationData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: `0` | `1` | `2` | `3`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

