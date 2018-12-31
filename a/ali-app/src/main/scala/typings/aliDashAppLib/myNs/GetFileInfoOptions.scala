package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: java.lang.String
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[aliDashAppLib.aliDashAppLibStrings.md5 | aliDashAppLib.aliDashAppLibStrings.sha1] = js.undefined
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, scala.Unit]] = js.undefined
}

