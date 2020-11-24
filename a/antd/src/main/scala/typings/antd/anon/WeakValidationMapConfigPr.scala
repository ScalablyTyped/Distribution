package typings.antd.anon

import typings.antd.configProviderContextMod.CSPConfig
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/config-provider.ConfigProviderProps> */
@js.native
trait WeakValidationMapConfigPr extends js.Object {
  
  var autoInsertSpaceInButton: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var componentSize: js.UndefOr[Validator[js.UndefOr[Null | SizeType]]] = js.native
  
  var csp: js.UndefOr[Validator[js.UndefOr[CSPConfig | Null]]] = js.native
  
  var direction: js.UndefOr[Validator[js.UndefOr[DirectionType | Null]]] = js.native
  
  var dropdownMatchSelectWidth: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var form: js.UndefOr[Validator[js.UndefOr[Null | ValidateMessages]]] = js.native
  
  var getPopupContainer: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* triggerNode */ HTMLElement, HTMLElement]) | Null]]
  ] = js.native
  
  var getTargetContainer: js.UndefOr[Validator[js.UndefOr[js.Function0[HTMLElement] | Null]]] = js.native
  
  var input: js.UndefOr[Validator[js.UndefOr[AutoComplete | Null]]] = js.native
  
  var locale: js.UndefOr[Validator[js.UndefOr[typings.antd.localeProviderMod.Locale | Null]]] = js.native
  
  var pageHeader: js.UndefOr[Validator[js.UndefOr[Ghost | Null]]] = js.native
  
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var renderEmpty: js.UndefOr[Validator[js.UndefOr[Null | RenderEmptyHandler]]] = js.native
  
  var space: js.UndefOr[Validator[js.UndefOr[Null | Size]]] = js.native
  
  var virtual: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}
object WeakValidationMapConfigPr {
  
  @scala.inline
  def apply(): WeakValidationMapConfigPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapConfigPr]
  }
  
  @scala.inline
  implicit class WeakValidationMapConfigPrOps[Self <: WeakValidationMapConfigPr] (val x: Self) extends AnyVal {
    
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
    def setAutoInsertSpaceInButton(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInsertSpaceInButton: Self = this.set("autoInsertSpaceInButton", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentSize(value: Validator[js.UndefOr[Null | SizeType]]): Self = this.set("componentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSize: Self = this.set("componentSize", js.undefined)
    
    @scala.inline
    def setCsp(value: Validator[js.UndefOr[CSPConfig | Null]]): Self = this.set("csp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[DirectionType | Null]]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDropdownMatchSelectWidth(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    
    @scala.inline
    def setForm(value: Validator[js.UndefOr[Null | ValidateMessages]]): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: Validator[js.UndefOr[(js.Function1[/* triggerNode */ HTMLElement, HTMLElement]) | Null]]): Self = this.set("getPopupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setGetTargetContainer(value: Validator[js.UndefOr[js.Function0[HTMLElement] | Null]]): Self = this.set("getTargetContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetTargetContainer: Self = this.set("getTargetContainer", js.undefined)
    
    @scala.inline
    def setInput(value: Validator[js.UndefOr[AutoComplete | Null]]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLocale(value: Validator[js.UndefOr[typings.antd.localeProviderMod.Locale | Null]]): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPageHeader(value: Validator[js.UndefOr[Ghost | Null]]): Self = this.set("pageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeader: Self = this.set("pageHeader", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRenderEmpty(value: Validator[js.UndefOr[Null | RenderEmptyHandler]]): Self = this.set("renderEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderEmpty: Self = this.set("renderEmpty", js.undefined)
    
    @scala.inline
    def setSpace(value: Validator[js.UndefOr[Null | Size]]): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setVirtual(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
