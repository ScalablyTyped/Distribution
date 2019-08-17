package typings.atAwsDashCryptoIe11DashDetection.buildKeyOperationMod

import typings.atAwsDashCryptoIe11DashDetection.buildKeyMod.Key
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOperation extends js.Object {
  val result: js.UndefOr[Key] = js.undefined
  def oncomplete(event: Event): Unit
  def onerror(event: Event): Unit
}

object KeyOperation {
  @scala.inline
  def apply(oncomplete: Event => Unit, onerror: Event => Unit, result: Key = null): KeyOperation = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror))
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[KeyOperation]
  }
}

