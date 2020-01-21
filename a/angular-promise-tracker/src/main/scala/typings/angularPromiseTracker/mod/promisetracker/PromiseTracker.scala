package typings.angularPromiseTracker.mod.promisetracker

import typings.angular.mod.IDeferred
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTracker extends js.Object {
  def active(): Boolean
  def addPromise[T](promise: IPromise[T]): IDeferred[Unit]
  def cancel(): Unit
  def createPromise(): IDeferred[Unit]
  def tracking(): Boolean
  def trackingCount(): Double
}

object PromiseTracker {
  @scala.inline
  def apply(
    active: () => Boolean,
    addPromise: IPromise[js.Any] => IDeferred[Unit],
    cancel: () => Unit,
    createPromise: () => IDeferred[Unit],
    tracking: () => Boolean,
    trackingCount: () => Double
  ): PromiseTracker = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), addPromise = js.Any.fromFunction1(addPromise), cancel = js.Any.fromFunction0(cancel), createPromise = js.Any.fromFunction0(createPromise), tracking = js.Any.fromFunction0(tracking), trackingCount = js.Any.fromFunction0(trackingCount))
  
    __obj.asInstanceOf[PromiseTracker]
  }
}

