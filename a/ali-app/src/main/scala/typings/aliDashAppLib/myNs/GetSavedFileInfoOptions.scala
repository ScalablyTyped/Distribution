package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: java.lang.String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, scala.Unit]] = js.undefined
}

