package typings.angularThrottle

import typings.angular.mod.global.Function
import typings.angularThrottle.anon.Leading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait IAngularStatic extends js.Object {
    
    def throttle(fn: Function, throttle: Double): Function = js.native
    def throttle(fn: Function, throttle: Double, options: Leading): Function = js.native
  }
}
