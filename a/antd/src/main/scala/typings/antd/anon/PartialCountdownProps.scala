package typings.antd.anon

import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.Formatter
import typings.antd.statisticUtilsMod.countdownValueType
import typings.antd.statisticUtilsMod.valueType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/statistic/Countdown.CountdownProps> */
trait PartialCountdownProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var formatter: js.UndefOr[Formatter] = js.undefined
  
  var groupSeparator: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var prefix: js.UndefOr[ReactNode] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var suffix: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var value: js.UndefOr[countdownValueType] = js.undefined
  
  var valueRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
  
  var valueStyle: js.UndefOr[CSSProperties] = js.undefined
}
object PartialCountdownProps {
  
  inline def apply(): PartialCountdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCountdownProps]
  }
  
  extension [Self <: PartialCountdownProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactNode): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
    
    inline def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: countdownValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueRender(value: /* node */ ReactNode => ReactNode): Self = StObject.set(x, "valueRender", js.Any.fromFunction1(value))
    
    inline def setValueRenderUndefined: Self = StObject.set(x, "valueRender", js.undefined)
    
    inline def setValueStyle(value: CSSProperties): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
    
    inline def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
