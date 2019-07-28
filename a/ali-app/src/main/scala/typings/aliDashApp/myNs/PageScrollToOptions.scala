package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 滚动 https://docs.alipay.com/mini/api/scroll
trait PageScrollToOptions extends js.Object {
  var scrollTop: Double
}

object PageScrollToOptions {
  @scala.inline
  def apply(scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop)
  
    __obj.asInstanceOf[PageScrollToOptions]
  }
}

