package typings.antvGPluginSvgRenderer

import typings.antvGLite.filterMod.ParsedFilterStyleProperty
import typings.antvGLite.mod.DisplayObject
import typings.std.Document
import typings.std.SVGDefsElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/Filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/Filter", "FILTER_PREFIX")
  @js.native
  val FILTER_PREFIX: /* "g-filter-" */ String = js.native
  
  inline def createOrUpdateFilter(document: Document, $def: SVGDefsElement, `object`: DisplayObject[Any, Any], $el: SVGElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFilter")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createOrUpdateFilter(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    filters: js.Array[ParsedFilterStyleProperty]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFilter")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
