package typings.aliApp.anon

import typings.aliApp.my.ImageSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ChooseImageOptions> */
@js.native
trait PartialChooseImageOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var count: js.UndefOr[Double] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.native
}

object PartialChooseImageOptions {
  @scala.inline
  def apply(): PartialChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseImageOptions]
  }
  @scala.inline
  implicit class PartialChooseImageOptionsOps[Self <: PartialChooseImageOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: ImageSourceType*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[ImageSourceType]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ ApFilePaths => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

