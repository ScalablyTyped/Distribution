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

