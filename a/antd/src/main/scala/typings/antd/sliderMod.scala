package typings.antd

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Label
import typings.antd.anon.PrefixCls
import typings.antd.antdBooleans.`false`
import typings.antd.antdBooleans.`true`
import typings.antd.tooltipMod.TooltipPlacement
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  @JSImport("antd/lib/slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (SliderSingleProps with RefAttributes[_]) | (SliderRangeProps with RefAttributes[_])
  ] = js.native
  
  type HandleGeneratorFn = js.Function1[/* config */ PrefixCls, ReactElement]
  
  @js.native
  trait HandleGeneratorInfo extends StObject {
    
    var dragging: js.UndefOr[Boolean] = js.native
    
    var index: Double = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object HandleGeneratorInfo {
    
    @scala.inline
    def apply(index: Double): HandleGeneratorInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleGeneratorInfo]
    }
    
    @scala.inline
    implicit class HandleGeneratorInfoMutableBuilder[Self <: HandleGeneratorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SliderBaseProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[SliderMarks] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Null | Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tipFormatter: js.UndefOr[Null | (js.Function1[/* value */ js.UndefOr[Double], ReactNode])] = js.native
    
    var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.native
    
    var tooltipPrefixCls: js.UndefOr[String] = js.native
    
    var tooltipVisible: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object SliderBaseProps {
    
    @scala.inline
    def apply(): SliderBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderBaseProps]
    }
    
    @scala.inline
    implicit class SliderBasePropsMutableBuilder[Self <: SliderBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setGetTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipPopupContainerUndefined: Self = StObject.set(x, "getTooltipPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setMarks(value: SliderMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTipFormatterNull: Self = StObject.set(x, "tipFormatter", null)
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setTooltipPlacement(value: TooltipPlacement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      @scala.inline
      def setTooltipPrefixCls(value: String): Self = StObject.set(x, "tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPrefixClsUndefined: Self = StObject.set(x, "tooltipPrefixCls", js.undefined)
      
      @scala.inline
      def setTooltipVisible(value: Boolean): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipVisibleUndefined: Self = StObject.set(x, "tooltipVisible", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type SliderMarks = NumberDictionary[ReactNode | Label]
  
  @js.native
  trait SliderRangeProps extends SliderBaseProps {
    
    var defaultValue: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.native
    
    var range: `true` = js.native
    
    var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    var value: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object SliderRangeProps {
    
    @scala.inline
    def apply(range: `true`): SliderRangeProps = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderRangeProps]
    }
    
    @scala.inline
    implicit class SliderRangePropsMutableBuilder[Self <: SliderRangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setOnAfterChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRange(value: `true`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SliderSingleProps extends SliderBaseProps {
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var handleStyle: js.UndefOr[CSSProperties] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var range: js.UndefOr[`false`] = js.native
    
    var trackStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object SliderSingleProps {
    
    @scala.inline
    def apply(): SliderSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderSingleProps]
    }
    
    @scala.inline
    implicit class SliderSinglePropsMutableBuilder[Self <: SliderSingleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRange(value: `false`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Visibles = NumberDictionary[Boolean]
  
  type _To = ForwardRefExoticComponent[
    (SliderSingleProps with RefAttributes[_]) | (SliderRangeProps with RefAttributes[_])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (SliderSingleProps with RefAttributes[_]) | (SliderRangeProps with RefAttributes[_])
  ] = default
}
