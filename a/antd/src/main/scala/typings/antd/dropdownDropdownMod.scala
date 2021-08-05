package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.AdjustX
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.dropdownButtonMod.DropdownButtonInterface
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownDropdownMod extends Shortcut {
  
  @JSImport("antd/lib/dropdown/dropdown", JSImport.Default)
  @js.native
  val default: DropdownInterface = js.native
  
  trait Align extends StObject {
    
    var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var overflow: js.UndefOr[AdjustX] = js.undefined
    
    var points: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var targetOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var useCssBottom: js.UndefOr[Boolean] = js.undefined
    
    var useCssRight: js.UndefOr[Boolean] = js.undefined
    
    var useCssTransform: js.UndefOr[Boolean] = js.undefined
  }
  object Align {
    
    inline def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPoints(value: js.Tuple2[String, String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setTargetOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      inline def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      inline def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      inline def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      inline def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      inline def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      inline def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  trait DropDownProps extends StObject {
    
    var align: js.UndefOr[Align] = js.undefined
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    var overlay: ReactElement | OverlayFunc
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropDownProps {
    
    inline def apply(overlay: ReactElement | OverlayFunc): DropDownProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownProps]
    }
    
    extension [Self <: DropDownProps](x: Self) {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      inline def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait DropdownInterface
    extends StObject
       with FunctionComponent[DropDownProps] {
    
    var Button: DropdownButtonInterface = js.native
  }
  
  type OverlayFunc = js.Function0[ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.topLeft
    - typings.antd.antdStrings.topCenter
    - typings.antd.antdStrings.topRight
    - typings.antd.antdStrings.bottomLeft
    - typings.antd.antdStrings.bottomCenter
    - typings.antd.antdStrings.bottomRight
  */
  trait Placement extends StObject
  
  type _To = DropdownInterface
  
  /* This means you don't have to write `default`, but can instead just say `dropdownDropdownMod.foo` */
  override def _to: DropdownInterface = default
}
