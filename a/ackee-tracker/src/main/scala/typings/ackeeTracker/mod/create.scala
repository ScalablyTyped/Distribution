package typings.ackeeTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ackee-tracker", "create")
@js.native
object create extends js.Object {
  
  def apply(server: ServerDetails): AckeeInstance = js.native
  def apply(server: ServerDetails, options: TrackingOptions): AckeeInstance = js.native
}
