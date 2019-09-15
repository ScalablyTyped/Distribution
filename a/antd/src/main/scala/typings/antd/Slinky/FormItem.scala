package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.error
import typings.antd.antdStrings.success
import typings.antd.antdStrings.validating
import typings.antd.antdStrings.warning
import typings.antd.esFormFormItemMod.FormItemProps
import typings.antd.esFormFormItemMod.FormLabelAlign
import typings.antd.esFormFormItemMod.default
import typings.antd.esGridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, htmlFor, id, className, required */
object FormItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esFormFormItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    colon: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: TagMod[Any] = null,
    label: TagMod[Any] = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    prefixCls: String = null,
    validateStatus: success | warning | error | validating | typings.antd.antdStrings.Empty = null,
    wrapperCol: ColProps = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback)
    if (help != null) __obj.updateDynamic("help")(help)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormItemProps
}

