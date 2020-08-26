package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideLoadingOptions extends js.Object {
  /**
    * 体指当前page实例，某些场景下，需要指明在哪个page执行hideLoading。
    */
  var page: js.Any = js.native
}

object HideLoadingOptions {
  @scala.inline
  def apply(page: js.Any): HideLoadingOptions = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLoadingOptions]
  }
  @scala.inline
  implicit class HideLoadingOptionsOps[Self <: HideLoadingOptions] (val x: Self) extends AnyVal {
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
    def setPage(value: js.Any): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

