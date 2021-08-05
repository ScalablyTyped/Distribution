package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ColorWeak
import typings.antDesignProLayout.anon.DefaultMessageId
import typings.antDesignProLayout.anon.DefaultOpenAll
import typings.antDesignProLayout.anon.MergerSettingsTypeProSett
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.mix
import typings.antDesignProLayout.antDesignProLayoutStrings.realDark
import typings.antDesignProLayout.antDesignProLayoutStrings.side
import typings.antDesignProLayout.antDesignProLayoutStrings.top
import typings.antDesignProLayout.defaultSettingsMod.ContentWidth
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingDrawerMod {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 可视化配置组件
    * @param props
    */
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Default)
  @js.native
  val default: FC[SettingDrawerProps] = js.native
  
  inline def getFormatMessage(): js.Function1[/* data */ DefaultMessageId, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMessage")().asInstanceOf[js.Function1[/* data */ DefaultMessageId, String]]
  
  type MergerSettingsType[T] = Partial[T] & ColorWeak
  
  trait SettingDrawerProps extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[js.Any] = js.undefined
    
    var hideColors: js.UndefOr[Boolean] = js.undefined
    
    var hideCopyButton: js.UndefOr[Boolean] = js.undefined
    
    var hideHintAlert: js.UndefOr[Boolean] = js.undefined
    
    var hideLoading: js.UndefOr[Boolean] = js.undefined
    
    var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
    
    var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeProSett, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[MergerSettingsTypeProSett] = js.undefined
  }
  object SettingDrawerProps {
    
    inline def apply(): SettingDrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingDrawerProps]
    }
    
    extension [Self <: SettingDrawerProps](x: Self) {
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setGetContainer(value: js.Any): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setHideColors(value: Boolean): Self = StObject.set(x, "hideColors", value.asInstanceOf[js.Any])
      
      inline def setHideColorsUndefined: Self = StObject.set(x, "hideColors", js.undefined)
      
      inline def setHideCopyButton(value: Boolean): Self = StObject.set(x, "hideCopyButton", value.asInstanceOf[js.Any])
      
      inline def setHideCopyButtonUndefined: Self = StObject.set(x, "hideCopyButton", js.undefined)
      
      inline def setHideHintAlert(value: Boolean): Self = StObject.set(x, "hideHintAlert", value.asInstanceOf[js.Any])
      
      inline def setHideHintAlertUndefined: Self = StObject.set(x, "hideHintAlert", js.undefined)
      
      inline def setHideLoading(value: Boolean): Self = StObject.set(x, "hideLoading", value.asInstanceOf[js.Any])
      
      inline def setHideLoadingUndefined: Self = StObject.set(x, "hideLoading", js.undefined)
      
      inline def setOnCollapseChange(value: /* collapse */ Boolean => Unit): Self = StObject.set(x, "onCollapseChange", js.Any.fromFunction1(value))
      
      inline def setOnCollapseChangeUndefined: Self = StObject.set(x, "onCollapseChange", js.undefined)
      
      inline def setOnSettingChange(value: /* settings */ MergerSettingsTypeProSett => Unit): Self = StObject.set(x, "onSettingChange", js.Any.fromFunction1(value))
      
      inline def setOnSettingChangeUndefined: Self = StObject.set(x, "onSettingChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setSettings(value: MergerSettingsTypeProSett): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  /* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings> */
  trait SettingDrawerState extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footerRender: js.UndefOr[`false`] = js.undefined
    
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    var headerRender: js.UndefOr[`false`] = js.undefined
    
    var headerTheme: js.UndefOr[MenuTheme] = js.undefined
    
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    var menu: js.UndefOr[DefaultOpenAll] = js.undefined
    
    var menuHeaderRender: js.UndefOr[`false`] = js.undefined
    
    var menuRender: js.UndefOr[`false`] = js.undefined
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
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
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeaderRender(value: `false`): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      inline def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
      
      inline def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
      
      inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRender(value: `false`): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      inline def setMenuRender(value: `false`): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
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
