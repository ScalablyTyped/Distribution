package typings.angularDotThrottle

import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object angularMod extends js.Object {
  @js.native
  trait IAngularStatic extends js.Object {
    def throttle(fn: Function, throttle: Double): Function = js.native
    def throttle(fn: Function, throttle: Double, options: Anon_Leading): Function = js.native
  }
  
}

