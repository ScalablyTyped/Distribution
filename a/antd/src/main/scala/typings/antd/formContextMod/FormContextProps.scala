package typings.antd.formContextMod

import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContextProps extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var vertical: Boolean
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormContextProps {
  @scala.inline
  def apply(
    vertical: Boolean,
    colon: js.UndefOr[Boolean] = js.undefined,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    name: String = null,
    wrapperCol: ColProps = null
  ): FormContextProps = {
    val __obj = js.Dynamic.literal(vertical = vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormContextProps]
  }
}

