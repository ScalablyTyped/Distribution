package typings.antvGPluginSvgRenderer

import typings.antvGLite.displayObjectsPathMod.ParsedPathStyleProps
import typings.antvGLite.imageMod.ParsedImageStyleProps
import typings.antvGLite.lineMod.ParsedLineStyleProps
import typings.antvGLite.polylineMod.ParsedPolylineStyleProps
import typings.antvGLite.rectMod.ParsedRectStyleProps
import typings.antvGLite.textMod.ParsedTextStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateImageElementAttribute($el: SVGElement, parsedStyle: ParsedImageStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateImageElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateLineElementAttribute($el: SVGElement, parsedStyle: ParsedLineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updatePathElementAttribute($el: SVGElement, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePathElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updatePolylineElementAttribute($el: SVGElement, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePolylineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateRectElementAttribute($el: SVGElement, parsedStyle: ParsedRectStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRectElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTextElementAttribute($el: SVGElement, parsedStyle: ParsedTextStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTextElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
