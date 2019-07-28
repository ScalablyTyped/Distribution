package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReInterval extends js.Object {
  def clear(): Unit
  def destroy(): Unit
  def reschedule(interval: Double): Unit
}

object ReInterval {
  @scala.inline
  def apply(clear: () => Unit, destroy: () => Unit, reschedule: Double => Unit): ReInterval = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), reschedule = js.Any.fromFunction1(reschedule))
  
    __obj.asInstanceOf[ReInterval]
  }
}

