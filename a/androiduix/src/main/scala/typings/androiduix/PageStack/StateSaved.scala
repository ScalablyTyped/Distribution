package typings.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSaved extends js.Object {
  var extra: js.UndefOr[js.Any] = js.native
  var pageId: String = js.native
}

object StateSaved {
  @scala.inline
  def apply(pageId: String): StateSaved = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSaved]
  }
  @scala.inline
  implicit class StateSavedOps[Self <: StateSaved] (val x: Self) extends AnyVal {
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
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
  }
  
}

