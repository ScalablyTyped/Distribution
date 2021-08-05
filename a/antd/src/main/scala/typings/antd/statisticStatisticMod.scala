package typings.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.TypeofCountdown
import typings.antd.countdownMod.default
import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.valueType
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticStatisticMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/statistic/Statistic", JSImport.Default)
    @js.native
    val ^ : FC[StatisticProps] & StatisticComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/statistic/Statistic", "default.Countdown")
    @js.native
    class Countdown ()
      extends typings.antd.countdownMod.default
    
    type _To = FC[StatisticProps] & StatisticComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FC[StatisticProps] & StatisticComponent = ^
  }
  
  trait StatisticComponent extends StObject {
    
    var Countdown: Instantiable0[default] & TypeofCountdown
  }
  object StatisticComponent {
    
    inline def apply(Countdown: Instantiable0[default] & TypeofCountdown): StatisticComponent = {
      val __obj = js.Dynamic.literal(Countdown = Countdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatisticComponent]
    }
    
    extension [Self <: StatisticComponent](x: Self) {
      
      inline def setCountdown(value: Instantiable0[default] & TypeofCountdown): Self = StObject.set(x, "Countdown", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatisticProps
    extends StObject
       with FormatConfig {
    
    var className: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[valueType] = js.undefined
    
    var valueRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
    
    var valueStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object StatisticProps {
    
    inline def apply(): StatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticProps]
    }
    
    extension [Self <: StatisticProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueRender(value: /* node */ ReactNode => ReactNode): Self = StObject.set(x, "valueRender", js.Any.fromFunction1(value))
      
      inline def setValueRenderUndefined: Self = StObject.set(x, "valueRender", js.undefined)
      
      inline def setValueStyle(value: CSSProperties): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
      
      inline def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
