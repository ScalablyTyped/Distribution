package typings.antd

import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required ? :boolean,   prefixCls  :string} */
trait FormItemLabelPropsrequire extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var prefixCls: String
  var required: js.UndefOr[Boolean] = js.undefined
}

object FormItemLabelPropsrequire {
  @scala.inline
  def apply(
    prefixCls: String,
    colon: js.UndefOr[Boolean] = js.undefined,
    htmlFor: String = null,
    label: ReactNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
}

