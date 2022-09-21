package typings.antd

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.PrefixCls
import typings.antd.antdBooleans.`false`
import typings.antd.antdBooleans.`true`
import typings.antd.tooltipMod.TooltipPlacement
import typings.rcSlider.marksMod.MarkObj
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  @JSImport("antd/lib/slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (SliderSingleProps & RefAttributes[Any]) | (SliderRangeProps & RefAttributes[Any])
  ] = js.native
  
  type HandleGeneratorFn = js.Function1[/* config */ PrefixCls, ReactElement]
  
  trait HandleGeneratorInfo extends StObject {
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var index: Double
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object HandleGeneratorInfo {
    
    inline def apply(index: Double): HandleGeneratorInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleGeneratorInfo]
    }
    
    extension [Self <: HandleGeneratorInfo](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Opens = NumberDictionary[Boolean]
  
  trait SliderBaseProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated `getTooltipPopupContainer` is deprecated which will be removed in next major
      *   version. Please use `tooltip.getPopupContainer` instead.
      */
    var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[SliderMarks] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Null | Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * @deprecated `tipFormatter` is deprecated which will be removed in next major version. Please
      *   use `tooltip.formatter` instead.
      */
    var tipFormatter: js.UndefOr[Null | (js.Function1[/* value */ js.UndefOr[Double], ReactNode])] = js.undefined
    
    var tooltip: js.UndefOr[SliderTooltipProps] = js.undefined
    
    /**
      * @deprecated `tooltipPlacement` is deprecated which will be removed in next major version.
      *   Please use `tooltip.placement` instead.
      */
    var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.undefined
    
    /**
      * @deprecated `tooltipPrefixCls` is deprecated which will be removed in next major version.
      *   Please use `tooltip.prefixCls` instead.
      */
    var tooltipPrefixCls: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated `tooltipVisible` is deprecated which will be removed in next major version. Please
      *   use `tooltip.open` instead.
      */
    var tooltipVisible: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderBaseProps {
    
    inline def apply(): SliderBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderBaseProps]
    }
    
    extension [Self <: SliderBaseProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setGetTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetTooltipPopupContainerUndefined: Self = StObject.set(x, "getTooltipPopupContainer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setMarks(value: SliderMarks): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      inline def setTipFormatterNull: Self = StObject.set(x, "tipFormatter", null)
      
      inline def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      inline def setTooltip(value: SliderTooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacement(value: TooltipPlacement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      inline def setTooltipPrefixCls(value: String): Self = StObject.set(x, "tooltipPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setTooltipPrefixClsUndefined: Self = StObject.set(x, "tooltipPrefixCls", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVisible(value: Boolean): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
      
      inline def setTooltipVisibleUndefined: Self = StObject.set(x, "tooltipVisible", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type SliderMarks = js.UndefOr[Record[String | Double, ReactNode | MarkObj]]
  
  trait SliderRange extends StObject {
    
    var draggableTrack: js.UndefOr[Boolean] = js.undefined
  }
  object SliderRange {
    
    inline def apply(): SliderRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderRange]
    }
    
    extension [Self <: SliderRange](x: Self) {
      
      inline def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      inline def setDraggableTrackUndefined: Self = StObject.set(x, "draggableTrack", js.undefined)
    }
  }
  
  trait SliderRangeProps
    extends StObject
       with SliderBaseProps {
    
    var defaultValue: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.undefined
    
    var range: `true` | SliderRange
    
    var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    var value: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object SliderRangeProps {
    
    inline def apply(range: `true` | SliderRange): SliderRangeProps = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderRangeProps]
    }
    
    extension [Self <: SliderRangeProps](x: Self) {
      
      inline def setDefaultValue(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value*))
      
      inline def setOnAfterChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRange(value: `true` | SliderRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value*))
      
      inline def setValue(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderSingleProps
    extends StObject
       with SliderBaseProps {
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var handleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var range: js.UndefOr[`false`] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderSingleProps {
    
    inline def apply(): SliderSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderSingleProps]
    }
    
    extension [Self <: SliderSingleProps](x: Self) {
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRange(value: `false`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderTooltipProps extends StObject {
    
    var formatter: js.UndefOr[Null | (js.Function1[/* value */ js.UndefOr[Double], ReactNode])] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[TooltipPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object SliderTooltipProps {
    
    inline def apply(): SliderTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderTooltipProps]
    }
    
    extension [Self <: SliderTooltipProps](x: Self) {
      
      inline def setFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterNull: Self = StObject.set(x, "formatter", null)
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[
    (SliderSingleProps & RefAttributes[Any]) | (SliderRangeProps & RefAttributes[Any])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (SliderSingleProps & RefAttributes[Any]) | (SliderRangeProps & RefAttributes[Any])
  ] = default
}
