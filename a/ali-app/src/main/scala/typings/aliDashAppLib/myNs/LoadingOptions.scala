package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * loading的文字内容
  		 */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 延迟显示，单位 ms，默认 0。如果在此时间之前调用了 my.hideLoading 则不会显示
  		 */
  var delay: js.UndefOr[scala.Double] = js.undefined
}

