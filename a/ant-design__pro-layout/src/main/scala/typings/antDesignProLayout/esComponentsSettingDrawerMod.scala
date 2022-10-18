package typings.antDesignProLayout

import typings.antDesignProLayout.anon.AutoClose
import typings.antDesignProLayout.anon.Color
import typings.antDesignProLayout.anon.ColorPrimary
import typings.antDesignProLayout.anon.DefaultMessageId
import typings.antDesignProLayout.anon.MergerSettingsTypeProSett
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.group
import typings.antDesignProLayout.antDesignProLayoutStrings.light
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.sub
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.esDefaultSettingsMod.ContentWidth
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSettingDrawerMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer", "SettingDrawer")
  @js.native
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  
  inline def getFormatMessage(): js.Function1[/* data */ DefaultMessageId, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMessage")().asInstanceOf[js.Function1[/* data */ DefaultMessageId, String]]
  
  type MergerSettingsType[T] = Partial[T] & ColorPrimary
  
  trait SettingDrawerProps extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    var colorList: js.UndefOr[`false` | js.Array[Color]] = js.undefined
    
    var defaultSettings: js.UndefOr[MergerSettingsTypeProSett] = js.undefined
    
    var disableUrlParams: js.UndefOr[Boolean] = js.undefined
    
    /** 使用实验性质的黑色主题 */
    var enableDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[Any] = js.undefined
    
    var hideCopyButton: js.UndefOr[Boolean] = js.undefined
    
    var hideHintAlert: js.UndefOr[Boolean] = js.undefined
    
    var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
    
    var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeProSett, Unit]] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[MergerSettingsTypeProSett] = js.undefined
    
    var themeOnly: js.UndefOr[Boolean] = js.undefined
  }
  object SettingDrawerProps {
    
    inline def apply(): SettingDrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingDrawerProps]
    }
    
    extension [Self <: SettingDrawerProps](x: Self) {
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setColorList(value: `false` | js.Array[Color]): Self = StObject.set(x, "colorList", value.asInstanceOf[js.Any])
      
      inline def setColorListUndefined: Self = StObject.set(x, "colorList", js.undefined)
      
      inline def setColorListVarargs(value: Color*): Self = StObject.set(x, "colorList", js.Array(value*))
      
      inline def setDefaultSettings(value: MergerSettingsTypeProSett): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      inline def setDefaultSettingsUndefined: Self = StObject.set(x, "defaultSettings", js.undefined)
      
      inline def setDisableUrlParams(value: Boolean): Self = StObject.set(x, "disableUrlParams", value.asInstanceOf[js.Any])
      
      inline def setDisableUrlParamsUndefined: Self = StObject.set(x, "disableUrlParams", js.undefined)
      
      inline def setEnableDarkTheme(value: Boolean): Self = StObject.set(x, "enableDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setEnableDarkThemeUndefined: Self = StObject.set(x, "enableDarkTheme", js.undefined)
      
      inline def setGetContainer(value: Any): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setHideCopyButton(value: Boolean): Self = StObject.set(x, "hideCopyButton", value.asInstanceOf[js.Any])
      
      inline def setHideCopyButtonUndefined: Self = StObject.set(x, "hideCopyButton", js.undefined)
      
      inline def setHideHintAlert(value: Boolean): Self = StObject.set(x, "hideHintAlert", value.asInstanceOf[js.Any])
      
      inline def setHideHintAlertUndefined: Self = StObject.set(x, "hideHintAlert", js.undefined)
      
      inline def setOnCollapseChange(value: /* collapse */ Boolean => Unit): Self = StObject.set(x, "onCollapseChange", js.Any.fromFunction1(value))
      
      inline def setOnCollapseChangeUndefined: Self = StObject.set(x, "onCollapseChange", js.undefined)
      
      inline def setOnSettingChange(value: /* settings */ MergerSettingsTypeProSett => Unit): Self = StObject.set(x, "onSettingChange", js.Any.fromFunction1(value))
      
      inline def setOnSettingChangeUndefined: Self = StObject.set(x, "onSettingChange", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSettings(value: MergerSettingsTypeProSett): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setThemeOnly(value: Boolean): Self = StObject.set(x, "themeOnly", value.asInstanceOf[js.Any])
      
      inline def setThemeOnlyUndefined: Self = StObject.set(x, "themeOnly", js.undefined)
    }
  }
  
  /* Inlined {  collapse :boolean | undefined,   language :string | undefined} & @ant-design/pro-layout.@ant-design/pro-layout/es/components/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.ProSettings> */
  trait SettingDrawerState extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    var colorPrimary: js.UndefOr[String] = js.undefined
    
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footerRender: js.UndefOr[`false`] = js.undefined
    
    var headerRender: js.UndefOr[`false`] = js.undefined
    
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    var menu: js.UndefOr[AutoClose] = js.undefined
    
    var menuHeaderRender: js.UndefOr[`false`] = js.undefined
    
    var menuRender: js.UndefOr[`false`] = js.undefined
    
    var navTheme: js.UndefOr[realDark | light] = js.undefined
    
    var siderMenuType: js.UndefOr[sub | group] = js.undefined
    
    var splitMenus: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object SettingDrawerState {
    
    inline def apply(): SettingDrawerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingDrawerState]
    }
    
    extension [Self <: SettingDrawerState](x: Self) {
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
      
      inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      inline def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      inline def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFooterRender(value: `false`): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setHeaderRender(value: `false`): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMenu(value: AutoClose): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRender(value: `false`): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      inline def setMenuRender(value: `false`): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: realDark | light): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setSiderMenuType(value: sub | group): Self = StObject.set(x, "siderMenuType", value.asInstanceOf[js.Any])
      
      inline def setSiderMenuTypeUndefined: Self = StObject.set(x, "siderMenuType", js.undefined)
      
      inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SettingItemProps extends StObject {
    
    var action: ReactElement
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledReason: js.UndefOr[ReactNode] = js.undefined
    
    var title: ReactNode
  }
  object SettingItemProps {
    
    inline def apply(action: ReactElement): SettingItemProps = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingItemProps]
    }
    
    extension [Self <: SettingItemProps](x: Self) {
      
      inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledReason(value: ReactNode): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
      inline def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
