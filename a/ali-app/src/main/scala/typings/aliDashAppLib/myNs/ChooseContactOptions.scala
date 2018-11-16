package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 选择类型，值为single（单选）或者 multi（多选） */
  var chooseType: aliDashAppLib.aliDashAppLibStrings.single | aliDashAppLib.aliDashAppLibStrings.multi | java.lang.String
  /** 是否包含自己 */
  var includeMe: js.UndefOr[scala.Boolean] = js.undefined
  /** 包含手机通讯录联系人的模式：默认为不包含（none）、或者仅仅包含双向通讯录联系人（known）、或者包含手机通讯录联系人（all） */
  var includeMobileContactMode: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.none | aliDashAppLib.aliDashAppLibStrings.known | aliDashAppLib.aliDashAppLibStrings.all | java.lang.String
  ] = js.undefined
  /** 最大选择人数，仅 chooseType 为 multi 时才有效 */
  var multiChooseMax: js.UndefOr[scala.Double] = js.undefined
  /** 多选达到上限的文案，仅 chooseType 为 multi 时才有效 */
  var multiChooseMaxTips: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  def success_MChooseContactOptions(result: aliDashAppLib.Anon_ContactsDicArray): scala.Unit
}

