package typings.antvDomUtil

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOuterHeightMod {
  
  @JSImport("@antv/dom-util/lib/get-outer-height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(el: HTMLElement, defaultValue: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
}
