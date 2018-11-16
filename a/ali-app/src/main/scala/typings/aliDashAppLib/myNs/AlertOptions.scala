package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 交互反馈 https://docs.alipay.com/mini/api/ui-feedback

trait AlertOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 按钮文字，默认确定 */
  var buttonText: java.lang.String
  /** alert框的内容 */
  var content: java.lang.String
  /** alert框的标题 */
  var title: java.lang.String
}

