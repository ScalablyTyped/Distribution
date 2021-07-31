package typings.antdMobile

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestMod {
  
  @JSImport("antd-mobile/lib/_util/closest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(el: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
}
