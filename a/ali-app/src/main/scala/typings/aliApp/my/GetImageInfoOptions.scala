package typings.aliApp.my

import typings.aliApp.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 图片路径，目前支持：
    * - 网络图片路径
    * - apFilePath路径
    * - 相对路径
    */
  var src: String = js.native
  @JSName("success")
  var success_GetImageInfoOptions: js.UndefOr[js.Function1[/* res */ Height, Unit]] = js.native
}

object GetImageInfoOptions {
  @scala.inline
  def apply(src: String): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoOptions]
  }
  @scala.inline
  implicit class GetImageInfoOptionsOps[Self <: GetImageInfoOptions] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ Height => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

