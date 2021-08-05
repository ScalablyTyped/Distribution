package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.ActiveLink
import typings.antd.anon.Affix
import typings.antd.anon.Href
import typings.antd.anon.TypeofAnchorLink
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorAnchorMod {
  
  @JSImport("antd/lib/anchor/Anchor", JSImport.Default)
  @js.native
  class default () extends Anchor
  /* static members */
  object default {
    
    @JSImport("antd/lib/anchor/Anchor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/anchor/Anchor", "default.Link")
    @js.native
    def Link: Instantiable0[typings.antd.anchorLinkMod.default] & TypeofAnchorLink = js.native
    inline def Link_=(x: Instantiable0[typings.antd.anchorLinkMod.default] & TypeofAnchorLink): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor/Anchor", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    inline def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/anchor/Anchor", "default.defaultProps")
    @js.native
    def defaultProps: Affix = js.native
    inline def defaultProps_=(x: Affix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Anchor extends Component[AnchorProps, AnchorState, ConfigConsumerProps] {
    
    /* private */ var animating: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchor(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchor(): Unit = js.native
    
    var content: ConfigConsumerProps = js.native
    
    def getContainer(): js.Any = js.native
    
    def getCurrentAnchor(): String = js.native
    def getCurrentAnchor(offsetTop: Double): String = js.native
    def getCurrentAnchor(offsetTop: Double, bounds: Double): String = js.native
    def getCurrentAnchor(offsetTop: Unit, bounds: Double): String = js.native
    
    def handleScroll(): Unit = js.native
    
    def handleScrollTo(link: String): Unit = js.native
    
    /* private */ var inkNode: js.Any = js.native
    
    /* private */ var links: js.Any = js.native
    
    /* private */ var prefixCls: js.Any = js.native
    
    def registerLink(link: String): Unit = js.native
    
    def saveInkNode(node: HTMLSpanElement): Unit = js.native
    
    /* private */ var scrollContainer: js.Any = js.native
    
    /* private */ var scrollEvent: js.Any = js.native
    
    def setCurrentActiveLink(link: String): Unit = js.native
    
    @JSName("state")
    var state_Anchor: ActiveLink = js.native
    
    def unregisterLink(link: String): Unit = js.native
    
    def updateInk(): Unit = js.native
    
    /* private */ var wrapperRef: js.Any = js.native
  }
  
  type AnchorContainer = HTMLElement | Window
  
  trait AnchorDefaultProps
    extends StObject
       with AnchorProps {
    
    @JSName("affix")
    var affix_AnchorDefaultProps: Boolean
    
    @JSName("getContainer")
    def getContainer_MAnchorDefaultProps(): AnchorContainer
    
    @JSName("prefixCls")
    var prefixCls_AnchorDefaultProps: String
    
    @JSName("showInkInFixed")
    var showInkInFixed_AnchorDefaultProps: Boolean
  }
  object AnchorDefaultProps {
    
    inline def apply(affix: Boolean, getContainer: () => AnchorContainer, prefixCls: String, showInkInFixed: Boolean): AnchorDefaultProps = {
      val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorDefaultProps]
    }
    
    extension [Self <: AnchorDefaultProps](x: Self) {
      
      inline def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      inline def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnchorProps extends StObject {
    
    var affix: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.undefined
    
    /** Return customize highlight anchor */
    var getCurrentAnchor: js.UndefOr[js.Function0[String]] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    /** Listening event when scrolling change active link */
    var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href, Unit]
      ] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showInkInFixed: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
    var targetOffset: js.UndefOr[Double] = js.undefined
  }
  object AnchorProps {
    
    inline def apply(): AnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorProps]
    }
    
    extension [Self <: AnchorProps](x: Self) {
      
      inline def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      inline def setAffixUndefined: Self = StObject.set(x, "affix", js.undefined)
      
      inline def setBounds(value: Double): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setGetCurrentAnchor(value: () => String): Self = StObject.set(x, "getCurrentAnchor", js.Any.fromFunction0(value))
      
      inline def setGetCurrentAnchorUndefined: Self = StObject.set(x, "getCurrentAnchor", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOnChange(value: /* currentActiveLink */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
      
      inline def setShowInkInFixedUndefined: Self = StObject.set(x, "showInkInFixed", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOffset(value: Double): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
    }
  }
  
  trait AnchorState extends StObject {
    
    var activeLink: Null | String
  }
  object AnchorState {
    
    inline def apply(): AnchorState = {
      val __obj = js.Dynamic.literal(activeLink = null)
      __obj.asInstanceOf[AnchorState]
    }
    
    extension [Self <: AnchorState](x: Self) {
      
      inline def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
    }
  }
  
  trait AntAnchor extends StObject {
    
    var activeLink: String | Null
    
    var onClick: js.UndefOr[
        js.Function2[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href, Unit]
      ] = js.undefined
    
    def registerLink(link: String): Unit
    
    def scrollTo(link: String): Unit
    
    def unregisterLink(link: String): Unit
  }
  object AntAnchor {
    
    inline def apply(registerLink: String => Unit, scrollTo: String => Unit, unregisterLink: String => Unit): AntAnchor = {
      val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink), activeLink = null)
      __obj.asInstanceOf[AntAnchor]
    }
    
    extension [Self <: AntAnchor](x: Self) {
      
      inline def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
      
      inline def setOnClick(value: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRegisterLink(value: String => Unit): Self = StObject.set(x, "registerLink", js.Any.fromFunction1(value))
      
      inline def setScrollTo(value: String => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setUnregisterLink(value: String => Unit): Self = StObject.set(x, "unregisterLink", js.Any.fromFunction1(value))
    }
  }
}
