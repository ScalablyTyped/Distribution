package typings.antvGPluginSvgRenderer

import typings.antvGLite.mod.DisplayObject
import typings.std.Document
import typings.std.SVGDefsElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/Shadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOrUpdateShadow(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    name: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateShadow")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
