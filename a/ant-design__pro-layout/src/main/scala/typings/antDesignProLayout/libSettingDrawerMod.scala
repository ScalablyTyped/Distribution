package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingDrawerMod extends Shortcut {
  
  /**
    * 可视化配置组件
    * @param props
    */
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Default)
  @js.native
  val default: FC[SettingDrawerProps] = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", "getFormatMessage")
  @js.native
  def getFormatMessage(): js.Function1[/* data */ DefaultMessageId, String] = js.native
  
  type MergerSettingsType[T] = Partial[T] with ColorWeak
  
  @js.native
  trait SettingDrawerProps extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[js.Any] = js.native
    
    var hideColors: js.UndefOr[Boolean] = js.native
    
    var hideCopyButton: js.UndefOr[Boolean] = js.native
    
    var hideHintAlert: js.UndefOr[Boolean] = js.native
    
    var hideLoading: js.UndefOr[Boolean] = js.native
    
    var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.native
    
    var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeProSett, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var publicPath: js.UndefOr[String] = js.native
    
    var settings: js.UndefOr[MergerSettingsTypeProSett] = js.native
  }
  object SettingDrawerProps {
    
    @scala.inline
    def apply(): SettingDrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingDrawerProps]
    }
    
    @scala.inline
    implicit class SettingDrawerPropsMutableBuilder[Self <: SettingDrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setGetContainer(value: js.Any): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setHideColors(value: Boolean): Self = StObject.set(x, "hideColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideColorsUndefined: Self = StObject.set(x, "hideColors", js.undefined)
      
      @scala.inline
      def setHideCopyButton(value: Boolean): Self = StObject.set(x, "hideCopyButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCopyButtonUndefined: Self = StObject.set(x, "hideCopyButton", js.undefined)
      
      @scala.inline
      def setHideHintAlert(value: Boolean): Self = StObject.set(x, "hideHintAlert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHintAlertUndefined: Self = StObject.set(x, "hideHintAlert", js.undefined)
      
      @scala.inline
      def setHideLoading(value: Boolean): Self = StObject.set(x, "hideLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideLoadingUndefined: Self = StObject.set(x, "hideLoading", js.undefined)
      
      @scala.inline
      def setOnCollapseChange(value: /* collapse */ Boolean => Unit): Self = StObject.set(x, "onCollapseChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseChangeUndefined: Self = StObject.set(x, "onCollapseChange", js.undefined)
      
      @scala.inline
      def setOnSettingChange(value: /* settings */ MergerSettingsTypeProSett => Unit): Self = StObject.set(x, "onSettingChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSettingChangeUndefined: Self = StObject.set(x, "onSettingChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setSettings(value: MergerSettingsTypeProSett): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  /* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings> */
  @js.native
  trait SettingDrawerState extends StObject {
    
    var collapse: js.UndefOr[Boolean] = js.native
    
    var colorWeak: js.UndefOr[Boolean] = js.native
    
    var contentWidth: js.UndefOr[ContentWidth] = js.native
    
    var fixSiderbar: js.UndefOr[Boolean] = js.native
    
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    var footerRender: js.UndefOr[`false`] = js.native
    
    var headerHeight: js.UndefOr[Double] = js.native
    
    var headerRender: js.UndefOr[`false`] = js.native
    
    var headerTheme: js.UndefOr[MenuTheme] = js.native
    
    var iconfontUrl: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var layout: js.UndefOr[side | top | mix] = js.native
    
    var menu: js.UndefOr[DefaultOpenAll] = js.native
    
    var menuHeaderRender: js.UndefOr[`false`] = js.native
    
    var menuRender: js.UndefOr[`false`] = js.native
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var splitMenus: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String | `false`] = js.native
  }
  object SettingDrawerState {
    
    @scala.inline
    def apply(): SettingDrawerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingDrawerState]
    }
    
    @scala.inline
    implicit class SettingDrawerStateMutableBuilder[Self <: SettingDrawerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      @scala.inline
      def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      @scala.inline
      def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFooterRender(value: `false`): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeaderRender(value: `false`): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      @scala.inline
      def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
      
      @scala.inline
      def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRender(value: `false`): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      @scala.inline
      def setMenuRender(value: `false`): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait SettingItemProps extends StObject {
    
    var action: ReactElement = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledReason: js.UndefOr[ReactNode] = js.native
    
    var title: ReactNode = js.native
  }
  object SettingItemProps {
    
    @scala.inline
    def apply(action: ReactElement): SettingItemProps = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingItemProps]
    }
    
    @scala.inline
    implicit class SettingItemPropsMutableBuilder[Self <: SettingItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledReason(value: ReactNode): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[SettingDrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSettingDrawerMod.foo` */
  override def _to: FC[SettingDrawerProps] = default
}
