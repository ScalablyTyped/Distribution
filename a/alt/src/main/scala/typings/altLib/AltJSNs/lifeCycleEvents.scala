package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait lifeCycleEvents extends js.Object

@JSGlobal("AltJS.lifeCycleEvents")
@js.native
object lifeCycleEvents extends js.Object {
  @js.native
  sealed trait bootstrap
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait error
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait init
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait rollback
    extends altLib.AltJSNs.lifeCycleEvents
  
  @js.native
  sealed trait snapshot
    extends altLib.AltJSNs.lifeCycleEvents
  
  val bootstrap: bootstrap with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val init: init with java.lang.String = js.native
  val rollback: rollback with java.lang.String = js.native
  val snapshot: snapshot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[altLib.AltJSNs.lifeCycleEvents with java.lang.String] = js.native
}

