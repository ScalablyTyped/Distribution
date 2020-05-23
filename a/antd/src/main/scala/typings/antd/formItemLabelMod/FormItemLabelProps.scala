package typings.antd.formItemLabelMod

import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemLabelProps extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemLabelProps {
  @scala.inline
  def apply(
    colon: js.UndefOr[Boolean] = js.undefined,
    htmlFor: String = null,
    label: ReactNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null
  ): FormItemLabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.get.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelProps]
  }
}

