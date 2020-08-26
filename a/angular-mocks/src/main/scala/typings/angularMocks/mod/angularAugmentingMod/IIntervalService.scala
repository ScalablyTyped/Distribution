package typings.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// IntervalService
// see https://docs.angularjs.org/api/ngMock/service/$interval
// Augments the original service
///////////////////////////////////////////////////////////////////////////
@js.native
trait IIntervalService extends js.Object {
  /**
    * Runs interval tasks scheduled to be run in the next `millis` milliseconds.
    *
    * @param millis - The maximum timeout amount to flush up until.
    * @return The amount of time moved forward.
    */
  def flush(millis: Double): Double = js.native
}

object IIntervalService {
  @scala.inline
  def apply(flush: Double => Double): IIntervalService = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
    __obj.asInstanceOf[IIntervalService]
  }
  @scala.inline
  implicit class IIntervalServiceOps[Self <: IIntervalService] (val x: Self) extends AnyVal {
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
    def setFlush(value: Double => Double): Self = this.set("flush", js.Any.fromFunction1(value))
  }
  
}

