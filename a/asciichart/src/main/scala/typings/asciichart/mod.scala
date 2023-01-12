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
  val default: String = js.native
  
  @JSImport("asciichart", "black")
  @js.native
  val black: String = js.native
  
  @JSImport("asciichart", "blue")
  @js.native
  val blue: String = js.native
  
  inline def colored(char: String, color: Color): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colored")(char.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("asciichart", "cyan")
  @js.native
  val cyan: String = js.native
  
  @JSImport("asciichart", "darkgray")
  @js.native
  val darkgray: String = js.native
  
  @JSImport("asciichart", "green")
  @js.native
  val green: String = js.native
  
  @JSImport("asciichart", "lightblue")
  @js.native
  val lightblue: String = js.native
  
  @JSImport("asciichart", "lightcyan")
  @js.native
  val lightcyan: String = js.native
  
  @JSImport("asciichart", "lightgray")
  @js.native
  val lightgray: String = js.native
  
  @JSImport("asciichart", "lightgreen")
  @js.native
  val lightgreen: String = js.native
  
  @JSImport("asciichart", "lightmagenta")
  @js.native
  val lightmagenta: String = js.native
  
  @JSImport("asciichart", "lightred")
  @js.native
  val lightred: String = js.native
  
  @JSImport("asciichart", "lightyellow")
  @js.native
  val lightyellow: String = js.native
  
  @JSImport("asciichart", "magenta")
  @js.native
  val magenta: String = js.native
  
  inline def plot(series: js.Array[Double | js.Array[Double]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plot")(series.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def plot(series: js.Array[Double | js.Array[Double]], cfg: PlotConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plot")(series.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("asciichart", "red")
  @js.native
  val red: String = js.native
  
  @JSImport("asciichart", "reset")
  @js.native
  val reset: String = js.native
  
  @JSImport("asciichart", "white")
  @js.native
  val white: String = js.native
  
  @JSImport("asciichart", "yellow")
  @js.native
  val yellow: String = js.native
  
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
    
    inline def apply(): PlotConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlotConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlotConfig] (val x: Self) extends AnyVal {
      
      inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setFormat(value: (/* x */ Double, /* i */ Double) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSymbols(value: js.Tuple10[String, String, String, String, String, String, String, String, String, String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
