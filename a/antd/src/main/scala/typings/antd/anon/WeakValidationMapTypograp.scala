package typings.antd.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.TypographyProps> */
@js.native
trait WeakValidationMapTypograp extends js.Object {
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
}

object WeakValidationMapTypograp {
  @scala.inline
  def apply(): WeakValidationMapTypograp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTypograp]
  }
  @scala.inline
  implicit class WeakValidationMapTypograpOps[Self <: WeakValidationMapTypograp] (val x: Self) extends AnyVal {
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
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

