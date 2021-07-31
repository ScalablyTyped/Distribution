package typings.asciichart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asciichart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asciichart", JSImport.Default)
  @js.native
  def default: String = js.native
  
  @JSImport("asciichart", "black")
  @js.native
  def black: String = js.native
  @scala.inline
  def black_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "blue")
  @js.native
  def blue: String = js.native
  @scala.inline
  def blue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def colored(char: String, color: Color): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colored")(char.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("asciichart", "cyan")
  @js.native
  def cyan: String = js.native
  @scala.inline
  def cyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyan")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "darkgray")
  @js.native
  def darkgray: String = js.native
  @scala.inline
  def darkgray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkgray")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "green")
  @js.native
  def green: String = js.native
  @scala.inline
  def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightblue")
  @js.native
  def lightblue: String = js.native
  @scala.inline
  def lightblue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightblue")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightcyan")
  @js.native
  def lightcyan: String = js.native
  @scala.inline
  def lightcyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightcyan")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightgray")
  @js.native
  def lightgray: String = js.native
  @scala.inline
  def lightgray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgray")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightgreen")
  @js.native
  def lightgreen: String = js.native
  @scala.inline
  def lightgreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightgreen")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightmagenta")
  @js.native
  def lightmagenta: String = js.native
  @scala.inline
  def lightmagenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightmagenta")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightred")
  @js.native
  def lightred: String = js.native
  @scala.inline
  def lightred_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightred")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "lightyellow")
  @js.native
  def lightyellow: String = js.native
  @scala.inline
  def lightyellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightyellow")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "magenta")
  @js.native
  def magenta: String = js.native
  @scala.inline
  def magenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magenta")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def plot(series: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plot")(series.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def plot(series: js.Array[Double], cfg: PlotConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plot")(series.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("asciichart", "red")
  @js.native
  def red: String = js.native
  @scala.inline
  def red_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "reset")
  @js.native
  def reset: String = js.native
  @scala.inline
  def reset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "white")
  @js.native
  def white: String = js.native
  @scala.inline
  def white_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
  
  @JSImport("asciichart", "yellow")
  @js.native
  def yellow: String = js.native
  @scala.inline
  def yellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  
  type Color = js.UndefOr[String]
  
  trait PlotConfig extends StObject {
    
    var colors: js.UndefOr[js.Array[Color]] = js.undefined
    
    var format: js.UndefOr[js.Function2[/* x */ Double, /* i */ Double, String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[String] = js.undefined
    
    var symbols: js.UndefOr[
        js.Tuple10[String, String, String, String, String, String, String, String, String, String]
      ] = js.undefined
  }
  object PlotConfig {
    
    @scala.inline
    def apply(): PlotConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlotConfig]
    }
    
    @scala.inline
    implicit class PlotConfigMutableBuilder[Self <: PlotConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: (/* x */ Double, /* i */ Double) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSymbols(value: js.Tuple10[String, String, String, String, String, String, String, String, String, String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
