package typings.antDesignProLayout.siderMenuSiderMenuMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.lg
import typings.antDesignProLayout.antDesignProLayoutStrings.md
import typings.antDesignProLayout.antDesignProLayoutStrings.sm
import typings.antDesignProLayout.antDesignProLayoutStrings.xl
import typings.antDesignProLayout.antDesignProLayoutStrings.xs
import typings.antDesignProLayout.antDesignProLayoutStrings.xxl
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'defaultCollapsed' | 'collapsed' | 'splitMenus' | 'isMobile' | 'menuData' | 'mode' | 'onCollapse' | 'openKeys' | 'handleOpenChange' | 'menuProps' | 'style' | 'theme' | 'formatMessage' | 'subMenuItemRender' | 'menuItemRender' | 'postMenuData' | 'location' | 'match' | 'staticContext' | 'history' | 'computedMatch' | 'route' | 'siderCollapsed' | 'translate' | 'inlist' | 'itemIcon' | 'aria-activedescendant' | 'onMouseEnter' | 'onLoadedData' | 'unselectable' | 'placeholder' | 'aria-multiselectable' | 'overflowedIndicator' | 'slot' | 'onClick' | 'onTouchStart' | 'level' | 'onDrop' | 'aria-grabbed' | 'children' | 'prefixCls' | 'onDragOver' | 'selectable' | 'autoSave' | 'onAnimationIteration' | 'spellCheck' | 'role' | 'forceSubMenuRender' | 'aria-multiline' | 'expandIcon' | 'about' | 'dir' | 'onPlaying' | 'aria-current' | 'itemType' | 'aria-relevant' | 'aria-placeholder' | 'autoCorrect' | 'onPointerMove' | 'aria-label' | 'aria-rowcount' | 'onPaste' | 'aria-busy' | 'resource' | 'onSeeked' | 'tabIndex' | 'onError' | 'onTimeUpdate' | 'aria-roledescription' | 'color' | 'onEnded' | 'onPointerCancel' | 'autoCapitalize' | 'inputMode' | 'onCompositionUpdate' | 'onMouseMove' | 'onSelect' | 'onStalled' | 'onPointerOut' | 'onAuxClick' | 'aria-autocomplete' | 'onCopy' | 'aria-live' | 'aria-keyshortcuts' | 'onDurationChange' | 'aria-orientation' | 'inlineCollapsed' | 'onVolumeChange' | 'lang' | 'aria-owns' | 'defaultMotions' | 'aria-atomic' | 'aria-dropeffect' | 'openTransitionName' | 'property' | 'is' | 'onLoadedMetadata' | 'aria-labelledby' | 'subMenuCloseDelay' | 'defaultOpenKeys' | 'onTransitionEnd' | 'onMouseOver' | 'onChange' | 'datatype' | 'onDragStart' | 'onSeeking' | 'aria-flowto' | 'onAnimationEnd' | 'onCanPlay' | 'aria-readonly' | 'onMouseOut' | 'onKeyDown' | 'aria-pressed' | 'onMouseLeave' | 'contextMenu' | 'onProgress' | 'aria-level' | 'contentEditable' | 'onPointerLeave' | 'onMouseUp' | 'multiple' | 'onInput' | 'itemRef' | 'results' | 'accessKey' | 'aria-haspopup' | 'aria-posinset' | 'onInvalid' | 'aria-required' | 'vocab' | 'aria-describedby' | 'onSuspend' | 'onLoad' | 'onTouchCancel' | 'onAnimationStart' | 'onTouchMove' | 'onPointerEnter' | 'selectedKeys' | 'aria-controls' | 'openAnimation' | 'focusable' | 'aria-modal' | 'onDragEnter' | 'direction' | 'onPointerOver' | 'onWaiting' | 'defaultActiveFirst' | 'onReset' | 'aria-selected' | 'onPlay' | 'onKeyUp' | 'onMouseDown' | 'radioGroup' | 'onSubmit' | 'onBeforeInput' | 'aria-disabled' | 'aria-sort' | 'onCompositionStart' | 'itemProp' | 'security' | 'aria-valuemin' | 'dangerouslySetInnerHTML' | 'aria-colcount' | 'onFocus' | 'onCanPlayThrough' | 'aria-invalid' | 'onBlur' | 'onDoubleClick' | 'aria-valuemax' | 'aria-details' | 'onContextMenu' | 'defaultValue' | 'suppressHydrationWarning' | 'aria-setsize' | 'onDragLeave' | 'getPopupContainer' | 'onTouchEnd' | 'onPause' | 'aria-checked' | 'defaultChecked' | 'builtinPlacements' | 'aria-valuetext' | 'prefix' | 'onEmptied' | 'onDeselect' | 'onPointerUp' | 'onCompositionEnd' | 'aria-colspan' | 'hidden' | 'collapsedWidth' | 'aria-errormessage' | 'onScroll' | 'activeKey' | 'subMenuOpenDelay' | 'onPointerDown' | 'aria-colindex' | 'onCut' | 'inlineIndent' | 'suppressContentEditableWarning' | 'aria-hidden' | 'onAbort' | 'onDragExit' | 'aria-valuenow' | 'id' | 'onWheel' | 'motion' | 'typeof' | 'triggerSubMenuAction' | 'onDrag' | 'aria-expanded' | 'defaultSelectedKeys' | 'draggable' | 'onEncrypted' | 'onDragEnd' | 'onDestroy' | 'aria-rowindex' | 'itemScope' | 'onRateChange' | 'onKeyPress' | 'onLoadStart' | 'itemID' | 'aria-rowspan' | 'title' | 'iconfontUrl' | 'menu' | 'fixSiderbar' | 'layout' | 'headerTheme' | 'navTheme' | 'fixedHeader' | 'colorWeak' | 'contentWidth' | 'primaryColor' | 'headerHeight', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ @js.native
trait SiderMenuProps extends js.Object {
  
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl | `false`] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]] = js.native
  
  var getContainer: js.UndefOr[`false`] = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var links: js.UndefOr[js.Array[ReactNode]] = js.native
  
  var logo: js.UndefOr[ReactNode] = js.native
  
  var menuContentRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.native
  
  var menuExtraRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.native
  
  var menuFooterRender: js.UndefOr[WithFalse[js.Function1[/* props */ js.UndefOr[this.type], ReactNode]]] = js.native
  
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[this.type], 
        ReactNode
      ]
    ]
  ] = js.native
  
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.native
  
  var siderWidth: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SiderMenuProps {
  
  @scala.inline
  def apply(): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderMenuProps]
  }
  
  @scala.inline
  implicit class SiderMenuPropsOps[Self <: SiderMenuProps] (val x: Self) extends AnyVal {
    
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
    def setBreakpoint(value: xs | sm | md | lg | xl | xxl | `false`): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactNode): Self = this.set("collapsedButtonRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactNode]]): Self = this.set("collapsedButtonRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedButtonRender: Self = this.set("collapsedButtonRender", js.undefined)
    
    @scala.inline
    def setGetContainer(value: `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: ReactNode*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[ReactNode]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLogo(value: ReactNode): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setMenuContentRenderFunction2(value: (SiderMenuProps, /* defaultDom */ ReactNode) => ReactNode): Self = this.set("menuContentRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuContentRender(value: WithFalse[js.Function2[SiderMenuProps, /* defaultDom */ ReactNode, ReactNode]]): Self = this.set("menuContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuContentRender: Self = this.set("menuContentRender", js.undefined)
    
    @scala.inline
    def setMenuExtraRenderFunction1(value: SiderMenuProps => ReactNode): Self = this.set("menuExtraRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuExtraRender(value: WithFalse[js.Function1[SiderMenuProps, ReactNode]]): Self = this.set("menuExtraRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuExtraRender: Self = this.set("menuExtraRender", js.undefined)
    
    @scala.inline
    def setMenuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => ReactNode): Self = this.set("menuFooterRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactNode]]): Self = this.set("menuFooterRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuFooterRender: Self = this.set("menuFooterRender", js.undefined)
    
    @scala.inline
    def setMenuHeaderRenderFunction3(
      value: (/* logo */ ReactNode, /* title */ ReactNode, /* props */ js.UndefOr[SiderMenuProps]) => ReactNode
    ): Self = this.set("menuHeaderRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMenuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ ReactNode, 
            /* title */ ReactNode, 
            /* props */ js.UndefOr[SiderMenuProps], 
            ReactNode
          ]
        ]
    ): Self = this.set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHeaderRender: Self = this.set("menuHeaderRender", js.undefined)
    
    @scala.inline
    def setOnMenuHeaderClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMenuHeaderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMenuHeaderClick: Self = this.set("onMenuHeaderClick", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    
    @scala.inline
    def setSiderWidth(value: Double): Self = this.set("siderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiderWidth: Self = this.set("siderWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
