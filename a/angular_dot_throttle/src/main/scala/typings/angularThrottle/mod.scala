package typings.angularThrottle

import typings.angular.mod.global.Function
import typings.angularThrottle.anon.Leading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait IAngularStatic extends StObject {
    
    def throttle(fn: Function, throttle: Double): Function = js.native
    def throttle(fn: Function, throttle: Double, options: Leading): Function = js.native
  }
}
