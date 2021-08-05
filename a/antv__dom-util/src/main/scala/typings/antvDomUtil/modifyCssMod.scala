package typings.antvDomUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifyCssMod {
  
  @JSImport("@antv/dom-util/lib/modify-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dom: HTMLElement, css: StringDictionary[js.Any]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dom.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
