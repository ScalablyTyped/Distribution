package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()，App.onShow() 中获取到这份数据
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
}

