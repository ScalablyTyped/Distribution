package typings.antvGPluginCanvasPathGenerator

import typings.antvGLite.distDisplayObjectsPathMod.ParsedPathStyleProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPathsPathMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/paths/Path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePath(context: CanvasRenderingContext2D, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(context.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
