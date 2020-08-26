package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.SetNavigationBarOptions> */
@js.native
trait PartialSetNavigationBarOp extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var borderBottomColor: js.UndefOr[String] = js.native
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var image: js.UndefOr[String] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialSetNavigationBarOp {
  @scala.inline
  def apply(): PartialSetNavigationBarOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetNavigationBarOp]
  }
  @scala.inline
  implicit class PartialSetNavigationBarOpOps[Self <: PartialSetNavigationBarOp] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderBottomColor(value: String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

