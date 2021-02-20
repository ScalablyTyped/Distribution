package typings.antd

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object affixMod {
  
  @JSImport("antd/lib/affix", JSImport.Default)
  @js.native
  class default () extends Affix
  object default {
    
    @JSImport("antd/lib/affix", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/affix", "default.contextType")
    @js.native
    def contextType: Context[ConfigConsumerProps] = js.native
    @scala.inline
    def contextType_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait AffixStatus extends StObject
  @JSImport("antd/lib/affix", "AffixStatus")
  @js.native
  object AffixStatus extends StObject {
    
    @js.native
    sealed trait None extends AffixStatus
    
    @js.native
    sealed trait Prepare extends AffixStatus
  }
  
  @js.native
  trait Affix
    extends Component[AffixProps, AffixState, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAffix(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAffix(prevProps: AffixProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAffix(): Unit = js.native
    
    @JSName("context")
    var context_Affix: ConfigConsumerProps = js.native
    
    var fixedNode: HTMLDivElement = js.native
    
    def getOffsetBottom(): js.UndefOr[Double] = js.native
    
    def getOffsetTop(): js.UndefOr[Double] = js.native
    
    var getTargetFunc: js.Any = js.native
    
    def lazyUpdatePosition(): Unit = js.native
    
    def measure(): Unit = js.native
    
    var placeholderNode: HTMLDivElement = js.native
    
    def prepareMeasure(): Unit = js.native
    
    def saveFixedNode(node: HTMLDivElement): Unit = js.native
    
    def savePlaceholderNode(node: HTMLDivElement): Unit = js.native
    
    var timeout: js.Any = js.native
    
    def updatePosition(): Unit = js.native
  }
  
  @js.native
  trait AffixProps extends StObject {
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** 距离窗口底部达到指定偏移量后触发 */
    var offsetBottom: js.UndefOr[Double] = js.native
    
    /**
      * 距离窗口顶部达到指定偏移量后触发
      */
    var offsetTop: js.UndefOr[Double] = js.native
    
    /** 固定状态改变时触发的回调函数 */
    var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
    var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.native
  }
  object AffixProps {
    
    @scala.inline
    def apply(): AffixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixProps]
    }
    
    @scala.inline
    implicit class AffixPropsMutableBuilder[Self <: AffixProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: () => Window | HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait AffixState extends StObject {
    
    var affixStyle: js.UndefOr[CSSProperties] = js.native
    
    var lastAffix: Boolean = js.native
    
    var placeholderStyle: js.UndefOr[CSSProperties] = js.native
    
    var prevTarget: Window | HTMLElement | Null = js.native
    
    var status: AffixStatus = js.native
  }
  object AffixState {
    
    @scala.inline
    def apply(lastAffix: Boolean, status: AffixStatus): AffixState = {
      val __obj = js.Dynamic.literal(lastAffix = lastAffix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AffixState]
    }
    
    @scala.inline
    implicit class AffixStateMutableBuilder[Self <: AffixState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixStyle(value: CSSProperties): Self = StObject.set(x, "affixStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixStyleUndefined: Self = StObject.set(x, "affixStyle", js.undefined)
      
      @scala.inline
      def setLastAffix(value: Boolean): Self = StObject.set(x, "lastAffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderStyle(value: CSSProperties): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
      
      @scala.inline
      def setPrevTarget(value: Window | HTMLElement): Self = StObject.set(x, "prevTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTargetNull: Self = StObject.set(x, "prevTarget", null)
      
      @scala.inline
      def setStatus(value: AffixStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
