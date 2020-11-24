package typings.angularPromiseTracker.mod.promisetracker

import typings.angular.mod.IDeferred
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseTracker extends js.Object {
  
  def active(): Boolean = js.native
  
  def addPromise[T](promise: IPromise[T]): IDeferred[Unit] = js.native
  
  def cancel(): Unit = js.native
  
  def createPromise(): IDeferred[Unit] = js.native
  
  def tracking(): Boolean = js.native
  
  def trackingCount(): Double = js.native
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
  
  @scala.inline
  implicit class PromiseTrackerOps[Self <: PromiseTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: () => Boolean): Self = this.set("active", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddPromise(value: IPromise[js.Any] => IDeferred[Unit]): Self = this.set("addPromise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatePromise(value: () => IDeferred[Unit]): Self = this.set("createPromise", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTracking(value: () => Boolean): Self = this.set("tracking", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrackingCount(value: () => Double): Self = this.set("trackingCount", js.Any.fromFunction0(value))
  }
}
