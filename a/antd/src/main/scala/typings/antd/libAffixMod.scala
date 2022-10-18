package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libConfigProviderContextMod.ConfigConsumerProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAffixMod extends Shortcut {
  
  @JSImport("antd/lib/affix", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AffixProps & RefAttributes[Affix]] = js.native
  
  @js.native
  sealed trait AffixStatus extends StObject
  @JSImport("antd/lib/affix", "AffixStatus")
  @js.native
  object AffixStatus extends StObject {
    
    @js.native
    sealed trait None
      extends StObject
         with AffixStatus
    
    @js.native
    sealed trait Prepare
      extends StObject
         with AffixStatus
  }
  
  @js.native
  trait Affix extends Component[InternalAffixProps, AffixState, Any] {
    
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
    
    /* private */ var getTargetFunc: Any = js.native
    
    def lazyUpdatePosition(): Unit = js.native
    
    def measure(): Unit = js.native
    
    var placeholderNode: HTMLDivElement = js.native
    
    def prepareMeasure(): Unit = js.native
    
    def saveFixedNode(node: HTMLDivElement): Unit = js.native
    
    def savePlaceholderNode(node: HTMLDivElement): Unit = js.native
    
    /* private */ var timeout: Any = js.native
    
    def updatePosition(): Unit = js.native
  }
  
  trait AffixProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    /** 距离窗口底部达到指定偏移量后触发 */
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    /** 距离窗口顶部达到指定偏移量后触发 */
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    /** 固定状态改变时触发的回调函数 */
    var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
    var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.undefined
  }
  object AffixProps {
    
    inline def apply(): AffixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixProps]
    }
    
    extension [Self <: AffixProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOnChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: () => Window | HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait AffixState extends StObject {
    
    var affixStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var lastAffix: Boolean
    
    var placeholderStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prevTarget: Window | HTMLElement | Null
    
    var status: AffixStatus
  }
  object AffixState {
    
    inline def apply(lastAffix: Boolean, status: AffixStatus): AffixState = {
      val __obj = js.Dynamic.literal(lastAffix = lastAffix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], prevTarget = null)
      __obj.asInstanceOf[AffixState]
    }
    
    extension [Self <: AffixState](x: Self) {
      
      inline def setAffixStyle(value: CSSProperties): Self = StObject.set(x, "affixStyle", value.asInstanceOf[js.Any])
      
      inline def setAffixStyleUndefined: Self = StObject.set(x, "affixStyle", js.undefined)
      
      inline def setLastAffix(value: Boolean): Self = StObject.set(x, "lastAffix", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderStyle(value: CSSProperties): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
      
      inline def setPrevTarget(value: Window | HTMLElement): Self = StObject.set(x, "prevTarget", value.asInstanceOf[js.Any])
      
      inline def setPrevTargetNull: Self = StObject.set(x, "prevTarget", null)
      
      inline def setStatus(value: AffixStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type InternalAffixClass = Affix
  
  trait InternalAffixProps
    extends StObject
       with AffixProps {
    
    var affixPrefixCls: String
  }
  object InternalAffixProps {
    
    inline def apply(affixPrefixCls: String): InternalAffixProps = {
      val __obj = js.Dynamic.literal(affixPrefixCls = affixPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalAffixProps]
    }
    
    extension [Self <: InternalAffixProps](x: Self) {
      
      inline def setAffixPrefixCls(value: String): Self = StObject.set(x, "affixPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[AffixProps & RefAttributes[Affix]]
  
  /* This means you don't have to write `default`, but can instead just say `libAffixMod.foo` */
  override def _to: ForwardRefExoticComponent[AffixProps & RefAttributes[Affix]] = default
}
