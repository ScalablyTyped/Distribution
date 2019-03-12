package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReInterval extends js.Object {
  def clear(): scala.Unit
  def destroy(): scala.Unit
  def reschedule(interval: scala.Double): scala.Unit
}

object ReInterval {
  @scala.inline
  def apply(clear: () => scala.Unit, destroy: () => scala.Unit, reschedule: scala.Double => scala.Unit): ReInterval = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), reschedule = js.Any.fromFunction1(reschedule))
  
    __obj.asInstanceOf[ReInterval]
  }
}

