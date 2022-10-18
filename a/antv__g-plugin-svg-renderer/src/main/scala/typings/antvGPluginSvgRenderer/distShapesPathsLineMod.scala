package typings.antvGPluginSvgRenderer

import typings.antvGLite.distDisplayObjectsLineMod.ParsedLineStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesPathsLineMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateLineElementAttribute($el: SVGElement, parsedStyle: ParsedLineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
