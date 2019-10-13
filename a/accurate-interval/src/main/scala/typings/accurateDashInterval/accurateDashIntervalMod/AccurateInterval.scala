package typings.accurateDashInterval.accurateDashIntervalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccurateInterval extends js.Object {
  def clear(): Unit
}

object AccurateInterval {
  @scala.inline
  def apply(clear: () => Unit): AccurateInterval = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[AccurateInterval]
  }
}

