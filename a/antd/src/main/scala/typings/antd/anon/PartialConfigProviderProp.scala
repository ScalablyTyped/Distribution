package typings.antd.anon

import typings.antd.configProviderContextMod.CSPConfig
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.renderEmptyMod.RenderEmptyHandler
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/config-provider.ConfigProviderProps> */
trait PartialConfigProviderProp extends StObject {
  
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var componentSize: js.UndefOr[SizeType] = js.undefined
  
  var csp: js.UndefOr[CSPConfig] = js.undefined
  
  var direction: js.UndefOr[DirectionType] = js.undefined
  
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[ValidateMessages] = js.undefined
  
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var input: js.UndefOr[AutoComplete] = js.undefined
  
  var locale: js.UndefOr[typings.antd.localeProviderMod.Locale] = js.undefined
  
  var pageHeader: js.UndefOr[Ghost] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
  
  var space: js.UndefOr[Size] = js.undefined
  
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object PartialConfigProviderProp {
  
  @scala.inline
  def apply(): PartialConfigProviderProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigProviderProp]
  }
  
  @scala.inline
  implicit class PartialConfigProviderPropMutableBuilder[Self <: PartialConfigProviderProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInsertSpaceInButton(value: Boolean): Self = StObject.set(x, "autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInsertSpaceInButtonUndefined: Self = StObject.set(x, "autoInsertSpaceInButton", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setComponentSize(value: SizeType): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
    
    @scala.inline
    def setCsp(value: CSPConfig): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
    
    @scala.inline
    def setForm(value: ValidateMessages): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setGetTargetContainer(value: () => HTMLElement): Self = StObject.set(x, "getTargetContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetContainerUndefined: Self = StObject.set(x, "getTargetContainer", js.undefined)
    
    @scala.inline
    def setInput(value: AutoComplete): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.antd.localeProviderMod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPageHeader(value: Ghost): Self = StObject.set(x, "pageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHeaderUndefined: Self = StObject.set(x, "pageHeader", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => ReactNode): Self = StObject.set(x, "renderEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderEmptyUndefined: Self = StObject.set(x, "renderEmpty", js.undefined)
    
    @scala.inline
    def setSpace(value: Size): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
