package typings
package angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTracker extends js.Object {
  def active(): scala.Boolean
  def addPromise[T](promise: angularLib.angularMod.angularNs.IPromise[T]): angularLib.angularMod.angularNs.IDeferred[scala.Unit]
  def cancel(): scala.Unit
  def createPromise(): angularLib.angularMod.angularNs.IDeferred[scala.Unit]
  def tracking(): scala.Boolean
  def trackingCount(): scala.Double
}

object PromiseTracker {
  @scala.inline
  def apply(
    active: js.Function0[scala.Boolean],
    addPromise: js.Function1[
      angularLib.angularMod.angularNs.IPromise[js.Any], 
      angularLib.angularMod.angularNs.IDeferred[scala.Unit]
    ],
    cancel: js.Function0[scala.Unit],
    createPromise: js.Function0[angularLib.angularMod.angularNs.IDeferred[scala.Unit]],
    tracking: js.Function0[scala.Boolean],
    trackingCount: js.Function0[scala.Double]
  ): PromiseTracker = {
    val __obj = js.Dynamic.literal(active = active, addPromise = addPromise, cancel = cancel, createPromise = createPromise, tracking = tracking, trackingCount = trackingCount)
  
    __obj.asInstanceOf[PromiseTracker]
  }
}

