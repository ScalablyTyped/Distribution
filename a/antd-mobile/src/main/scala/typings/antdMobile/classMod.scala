package typings.antdMobile

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("antd-mobile/lib/_util/class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(node: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasClass(node: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeClass(node: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
