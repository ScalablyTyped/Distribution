package typings.antd

import typings.antd.statisticStatisticMod.StatisticProps
import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.Formatter
import typings.antd.statisticUtilsMod.countdownValueType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countdownMod {
  
  @JSImport("antd/lib/statistic/Countdown", JSImport.Default)
  @js.native
  class default () extends Countdown
  object default {
    
    /* static member */
    /* Inlined std.Partial<antd.antd/lib/statistic/Countdown.CountdownProps> */
    object defaultProps {
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.className")
      @js.native
      def className: js.UndefOr[String] = js.native
      inline def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.decimalSeparator")
      @js.native
      def decimalSeparator: js.UndefOr[String] = js.native
      inline def decimalSeparator_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.format")
      @js.native
      def format: js.UndefOr[String] = js.native
      inline def format_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.formatter")
      @js.native
      def formatter: js.UndefOr[Formatter] = js.native
      inline def formatter_=(x: js.UndefOr[Formatter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatter")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.groupSeparator")
      @js.native
      def groupSeparator: js.UndefOr[String] = js.native
      inline def groupSeparator_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupSeparator")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.loading")
      @js.native
      def loading: js.UndefOr[Boolean] = js.native
      inline def loading_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.onFinish")
      @js.native
      def onFinish: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onFinish_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
      inline def onMouseEnter_=(x: js.UndefOr[MouseEventHandler[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
      inline def onMouseLeave_=(x: js.UndefOr[MouseEventHandler[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.precision")
      @js.native
      def precision: js.UndefOr[Double] = js.native
      inline def precision_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("precision")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.prefix")
      @js.native
      def prefix: js.UndefOr[ReactNode] = js.native
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: js.UndefOr[String] = js.native
      inline def prefixCls_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      inline def prefix_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.style")
      @js.native
      def style: js.UndefOr[CSSProperties] = js.native
      inline def style_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.suffix")
      @js.native
      def suffix: js.UndefOr[ReactNode] = js.native
      inline def suffix_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.title")
      @js.native
      def title: js.UndefOr[ReactNode] = js.native
      inline def title_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.value")
      @js.native
      def value: js.UndefOr[countdownValueType] = js.native
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.valueRender")
      @js.native
      def valueRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.native
      inline def valueRender_=(x: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueRender")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/statistic/Countdown", "default.defaultProps.valueStyle")
      @js.native
      def valueStyle: js.UndefOr[CSSProperties] = js.native
      inline def valueStyle_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueStyle")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: js.UndefOr[countdownValueType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Countdown
    extends Component[CountdownProps, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MCountdown(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCountdown(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCountdown(): Unit = js.native
    
    var countdownId: js.UndefOr[Double] = js.native
    
    def formatCountdown(value: countdownValueType, config: FormatConfig): String = js.native
    
    def startTimer(): Unit = js.native
    
    def stopTimer(): Unit = js.native
    
    def syncTimer(): Unit = js.native
    
    def valueRender(node: ReactElement): ReactElement = js.native
  }
  
  trait CountdownProps
    extends StObject
       with StatisticProps {
    
    var format: js.UndefOr[String] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("value")
    var value_CountdownProps: js.UndefOr[countdownValueType] = js.undefined
  }
  object CountdownProps {
    
    inline def apply(): CountdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountdownProps]
    }
    
    extension [Self <: CountdownProps](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setValue(value: countdownValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
