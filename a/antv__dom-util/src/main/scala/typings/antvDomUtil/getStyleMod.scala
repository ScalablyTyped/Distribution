package typings.antvDomUtil

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStyleMod {
  
  @JSImport("@antv/dom-util/lib/get-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dom: HTMLElement, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def default(dom: HTMLElement, name: String, defaultValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dom.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
