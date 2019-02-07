package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateFieldsOptions extends js.Object {
  /** 所有表单域是否在第一个校验规则失败后停止继续校验 */
  var first: js.UndefOr[scala.Boolean] = js.undefined
  /** 指定哪些表单域在第一个校验规则失败后停止继续校验 */
  var firstFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 已经校验过的表单域，在 validateTrigger 再次被触发时是否再次校验 */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** 定义 validateFieldsAndScroll 的滚动行为 */
  var scroll: js.UndefOr[DomScrollIntoViewConfig] = js.undefined
}

