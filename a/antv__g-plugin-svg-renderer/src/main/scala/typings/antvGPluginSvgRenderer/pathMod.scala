package typings.antvGPluginSvgRenderer

import typings.antvGLite.displayObjectsPathMod.ParsedPathStyleProps
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/paths/Path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updatePathElementAttribute($el: SVGElement, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePathElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
