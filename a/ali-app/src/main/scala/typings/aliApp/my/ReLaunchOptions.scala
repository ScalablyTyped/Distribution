package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReLaunchOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 需要跳转的应用内页面路径 , 路径后可以带参数。
    * 参数与路径之间使用?分隔，参数键与参数值用=相连，不同参数用&分隔
    * 如 'path?key=value&key2=value2'，如果跳转的页面路径是 tabBar 页面则不能带参数
    */
  var url: String = js.native
}

object ReLaunchOptions {
  @scala.inline
  def apply(url: String): ReLaunchOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLaunchOptions]
  }
  @scala.inline
  implicit class ReLaunchOptionsOps[Self <: ReLaunchOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

