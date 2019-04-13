package typings
package angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTracker extends js.Object {
  def active(): scala.Boolean
  def addPromise[T](promise: angularLib.angularMod.IPromise[T]): angularLib.angularMod.IDeferred[scala.Unit]
  def cancel(): scala.Unit
  def createPromise(): angularLib.angularMod.IDeferred[scala.Unit]
  def tracking(): scala.Boolean
  def trackingCount(): scala.Double
}

object PromiseTracker {
  @scala.inline
  def apply(
    active: () => scala.Boolean,
    addPromise: angularLib.angularMod.IPromise[js.Any] => angularLib.angularMod.IDeferred[scala.Unit],
    cancel: () => scala.Unit,
    createPromise: () => angularLib.angularMod.IDeferred[scala.Unit],
    tracking: () => scala.Boolean,
    trackingCount: () => scala.Double
  ): PromiseTracker = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), addPromise = js.Any.fromFunction1(addPromise), cancel = js.Any.fromFunction0(cancel), createPromise = js.Any.fromFunction0(createPromise), tracking = js.Any.fromFunction0(tracking), trackingCount = js.Any.fromFunction0(trackingCount))
  
    __obj.asInstanceOf[PromiseTracker]
  }
}

