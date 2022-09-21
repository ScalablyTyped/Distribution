package typings.antvGPluginSvgRenderer

import typings.antvGLite.imageMod.ParsedImageStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateImageElementAttribute($el: SVGElement, parsedStyle: ParsedImageStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateImageElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
