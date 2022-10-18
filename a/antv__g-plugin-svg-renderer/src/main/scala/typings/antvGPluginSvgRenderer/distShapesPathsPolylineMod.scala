package typings.antvGPluginSvgRenderer

import typings.antvGLite.distDisplayObjectsPolylineMod.ParsedPolylineStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesPathsPolylineMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updatePolylineElementAttribute($el: SVGElement, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePolylineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
