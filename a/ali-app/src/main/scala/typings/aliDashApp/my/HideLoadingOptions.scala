package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideLoadingOptions extends js.Object {
  /**
  		 * 体指当前page实例，某些场景下，需要指明在哪个page执行hideLoading。
  		 */
  var page: js.Any
}

object HideLoadingOptions {
  @scala.inline
  def apply(page: js.Any): HideLoadingOptions = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HideLoadingOptions]
  }
}

