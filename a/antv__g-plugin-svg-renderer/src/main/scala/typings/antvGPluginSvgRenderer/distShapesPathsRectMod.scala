package typings.antvGPluginSvgRenderer

import typings.antvGLite.distDisplayObjectsRectMod.ParsedRectStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesPathsRectMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateRectElementAttribute($el: SVGElement, parsedStyle: ParsedRectStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRectElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
