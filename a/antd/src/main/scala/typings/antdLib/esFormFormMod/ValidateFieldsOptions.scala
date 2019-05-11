package typings
package antdLib.esFormFormMod

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

object ValidateFieldsOptions {
  @scala.inline
  def apply(
    first: js.UndefOr[scala.Boolean] = js.undefined,
    firstFields: js.Array[java.lang.String] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: DomScrollIntoViewConfig = null
  ): ValidateFieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first)
    if (firstFields != null) __obj.updateDynamic("firstFields")(firstFields)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    __obj.asInstanceOf[ValidateFieldsOptions]
  }
}

