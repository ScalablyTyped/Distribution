package typings.aliApp.my

import typings.aliApp.aliAppStrings.exception
import typings.aliApp.aliAppStrings.fail
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 文字内容
    */
  var content: String = js.native
  /**
    * 显示时长，单位为 ms，默认 2000
    */
  var duration: js.UndefOr[Double] = js.native
  /** toast 类型，展示相应图标，默认 none，支持 success / fail / exception / none’。其中 exception 类型必须传文字信息 */
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.native
}

object ToastOptions {
  @scala.inline
  def apply(content: String): ToastOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setType(value: none | success | fail | exception | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

