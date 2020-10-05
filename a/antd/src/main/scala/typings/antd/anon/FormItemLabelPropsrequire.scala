package typings.antd.anon

import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required :boolean | undefined,   prefixCls :string} */
@js.native
trait FormItemLabelPropsrequire extends js.Object {
  var colon: js.UndefOr[Boolean] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  var labelCol: js.UndefOr[ColProps] = js.native
  var prefixCls: String = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object FormItemLabelPropsrequire {
  @scala.inline
  def apply(prefixCls: String): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
  @scala.inline
  implicit class FormItemLabelPropsrequireOps[Self <: FormItemLabelPropsrequire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColon: Self = this.set("colon", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelAlign(value: FormLabelAlign): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    @scala.inline
    def setLabelCol(value: ColProps): Self = this.set("labelCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCol: Self = this.set("labelCol", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

