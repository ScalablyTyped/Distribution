package typings.antd.configProviderMod

import typings.antd.anon.AutoComplete
import typings.antd.anon.Ghost
import typings.antd.anon.Size
import typings.antd.anon.ValidateMessages
import typings.antd.configProviderContextMod.CSPConfig
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.localeProviderMod.Locale
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigProviderProps extends js.Object {
  
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var componentSize: js.UndefOr[SizeType] = js.native
  
  var csp: js.UndefOr[CSPConfig] = js.native
  
  var direction: js.UndefOr[DirectionType] = js.native
  
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[ValidateMessages] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var input: js.UndefOr[AutoComplete] = js.native
  
  var locale: js.UndefOr[Locale] = js.native
  
  var pageHeader: js.UndefOr[Ghost] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.native
  
  var space: js.UndefOr[Size] = js.native
  
  var virtual: js.UndefOr[Boolean] = js.native
}
object ConfigProviderProps {
  
  @scala.inline
  def apply(): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigProviderProps]
  }
  
  @scala.inline
  implicit class ConfigProviderPropsOps[Self <: ConfigProviderProps] (val x: Self) extends AnyVal {
    
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
    def setAutoInsertSpaceInButton(value: Boolean): Self = this.set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInsertSpaceInButton: Self = this.set("autoInsertSpaceInButton", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentSize(value: SizeType): Self = this.set("componentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSize: Self = this.set("componentSize", js.undefined)
    
    @scala.inline
    def setCsp(value: CSPConfig): Self = this.set("csp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionType): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    
    @scala.inline
    def setForm(value: ValidateMessages): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setGetTargetContainer(value: () => HTMLElement): Self = this.set("getTargetContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTargetContainer: Self = this.set("getTargetContainer", js.undefined)
    
    @scala.inline
    def setInput(value: AutoComplete): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPageHeader(value: Ghost): Self = this.set("pageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeader: Self = this.set("pageHeader", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => ReactNode): Self = this.set("renderEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderEmpty: Self = this.set("renderEmpty", js.undefined)
    
    @scala.inline
    def setSpace(value: Size): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
