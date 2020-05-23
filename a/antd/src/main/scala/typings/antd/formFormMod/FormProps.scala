package typings.antd.formFormMod

import typings.antd.formUtilMod.FormInstance
import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormProps * / any, 'form'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormProps * / any[P]} */ trait FormProps extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[FormInstance] = js.undefined
  var hideRequiredMark: js.UndefOr[Boolean] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
  var layout: js.UndefOr[FormLayout] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var scrollToFirstError: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    colon: js.UndefOr[Boolean] = js.undefined,
    form: FormInstance = null,
    hideRequiredMark: js.UndefOr[Boolean] = js.undefined,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null,
    layout: FormLayout = null,
    name: String = null,
    prefixCls: String = null,
    scrollToFirstError: js.UndefOr[Boolean] = js.undefined,
    size: SizeType = null,
    wrapperCol: ColProps = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.get.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRequiredMark)) __obj.updateDynamic("hideRequiredMark")(hideRequiredMark.get.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToFirstError)) __obj.updateDynamic("scrollToFirstError")(scrollToFirstError.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

