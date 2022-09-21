package typings.antvGPluginCanvasPathGenerator

import typings.antvGLite.polylineMod.ParsedPolylineStyleProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/paths/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePath(context: CanvasRenderingContext2D, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
