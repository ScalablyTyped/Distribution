package typings.ackeeTracker.anon

import typings.ackeeTracker.ackeeTrackerBooleans.`false`
import typings.ackeeTracker.ackeeTrackerBooleans.`true`
import typings.ackeeTracker.mod.DefaultData
import typings.ackeeTracker.mod.DetailedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(): DefaultData = js.native
  def apply(detailed: `false`): DefaultData = js.native
  def apply(detailed: `true`): DefaultData with DetailedData = js.native
}
