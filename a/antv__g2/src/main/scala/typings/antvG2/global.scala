package typings.antvG2

import typings.antvG2.anon.PartialChartProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object G2 {
    
    @JSGlobal("G2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("G2.Animate")
    @js.native
    val Animate: typings.antvG2.mod.Animate = js.native
    
    @JSGlobal("G2.BashView")
    @js.native
    class BashView ()
      extends typings.antvG2.mod.BashView
    
    @JSGlobal("G2.Chart")
    @js.native
    class Chart protected ()
      extends typings.antvG2.mod.Chart {
      def this(config: PartialChartProps) = this()
    }
    
    @JSGlobal("G2.ChartAxisConfig")
    @js.native
    class ChartAxisConfig ()
      extends typings.antvG2.mod.ChartAxisConfig
    
    @JSGlobal("G2.ChartGuide")
    @js.native
    class ChartGuide ()
      extends typings.antvG2.mod.ChartGuide
    
    @JSGlobal("G2.DomUtil")
    @js.native
    class DomUtil ()
      extends typings.antvG2.mod.DomUtil
    
    @JSGlobal("G2.Global")
    @js.native
    class Global ()
      extends typings.antvG2.mod.Global
    
    @JSGlobal("G2.MatrixUtil")
    @js.native
    class MatrixUtil ()
      extends typings.antvG2.mod.MatrixUtil
    
    @JSGlobal("G2.PathUtil")
    @js.native
    class PathUtil ()
      extends typings.antvG2.mod.PathUtil
    
    /**
      * config interface
      */
    @JSGlobal("G2.Scale")
    @js.native
    class Scale[T] ()
      extends typings.antvG2.mod.Scale[T]
    
    @JSGlobal("G2.ScaleCat")
    @js.native
    class ScaleCat[T] ()
      extends typings.antvG2.mod.ScaleCat[T]
    
    @JSGlobal("G2.ScaleLinear")
    @js.native
    class ScaleLinear ()
      extends typings.antvG2.mod.ScaleLinear
    
    @JSGlobal("G2.ScaleLog")
    @js.native
    class ScaleLog ()
      extends typings.antvG2.mod.ScaleLog
    
    @JSGlobal("G2.ScalePow")
    @js.native
    class ScalePow ()
      extends typings.antvG2.mod.ScalePow
    
    @JSGlobal("G2.ScaleTime")
    @js.native
    class ScaleTime ()
      extends typings.antvG2.mod.ScaleTime
    
    @JSGlobal("G2.Shape")
    @js.native
    val Shape: typings.antvG2.mod.Shape = js.native
    
    @JSGlobal("G2.Util")
    @js.native
    val Util: typings.antvG2.mod.Util = js.native
    
    @JSGlobal("G2.View")
    @js.native
    class View ()
      extends typings.antvG2.mod.View
    
    inline def markerAction(x: Double, y: Double, r: Double, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markerAction")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("G2.scaleTimeCat")
    @js.native
    class scaleTimeCat ()
      extends typings.antvG2.mod.scaleTimeCat
    
    inline def track(option: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("G2.version")
    @js.native
    val version: String = js.native
  }
}
