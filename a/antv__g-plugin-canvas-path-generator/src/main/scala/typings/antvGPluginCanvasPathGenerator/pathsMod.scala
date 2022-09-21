package typings.antvGPluginCanvasPathGenerator

import typings.antvGLite.circleMod.ParsedCircleStyleProps
import typings.antvGLite.displayObjectsPathMod.ParsedPathStyleProps
import typings.antvGLite.ellipseMod.ParsedEllipseStyleProps
import typings.antvGLite.lineMod.ParsedLineStyleProps
import typings.antvGLite.polygonMod.ParsedPolygonStyleProps
import typings.antvGLite.polylineMod.ParsedPolylineStyleProps
import typings.antvGLite.rectMod.ParsedRectStyleProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePath(context: CanvasRenderingContext2D, parsedStyle: ParsedCircleStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CirclePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def EllipsePath(context: CanvasRenderingContext2D, parsedStyle: ParsedEllipseStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EllipsePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def LinePath(context: CanvasRenderingContext2D, parsedStyle: ParsedLineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LinePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PathPath(context: CanvasRenderingContext2D, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PathPath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PolygonPath(context: CanvasRenderingContext2D, parsedStyle: ParsedPolygonStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PolygonPath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PolylinePath(context: CanvasRenderingContext2D, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PolylinePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def RectPath(context: CanvasRenderingContext2D, parsedStyle: ParsedRectStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RectPath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
