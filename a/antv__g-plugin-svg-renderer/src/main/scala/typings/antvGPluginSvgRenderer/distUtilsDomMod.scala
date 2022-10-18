package typings.antvGPluginSvgRenderer

import typings.std.Document
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsDomMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSVGElement(`type`: String): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  inline def createSVGElement(`type`: String, doc: Document): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
}
