package typings.antvG2plot

import typings.antvG2plot.anon.A
import typings.antvG2plot.typesPatternMod.PatternCfg
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternUtilMod {
  
  @JSImport("@antv/g2plot/lib/utils/pattern/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawBackground(context: CanvasRenderingContext2D, cfg: PatternCfg, width: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBackground")(context.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawBackground(context: CanvasRenderingContext2D, cfg: PatternCfg, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBackground")(context.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPixelRatio(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixelRatio")().asInstanceOf[Double]
  
  inline def getSymbolsPosition(unitSize: Double, isStagger: Boolean): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolsPosition")(unitSize.asInstanceOf[js.Any], isStagger.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def getUnitPatternSize(size: Double, padding: Double, isStagger: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnitPatternSize")(size.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], isStagger.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def initCanvas(width: Double): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("initCanvas")(width.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  inline def initCanvas(width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("initCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def transformMatrix(dpr: Double, rotation: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMatrix")(dpr.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[A]
}
