package typings.antvGPluginSvgRenderer

import typings.antvGLite.textMod.ParsedTextStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateTextElementAttribute($el: SVGElement, parsedStyle: ParsedTextStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTextElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
