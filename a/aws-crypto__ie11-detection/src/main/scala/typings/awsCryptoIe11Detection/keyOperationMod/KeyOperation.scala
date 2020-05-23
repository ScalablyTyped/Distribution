package typings.awsCryptoIe11Detection.keyOperationMod

import typings.awsCryptoIe11Detection.keyMod.Key
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
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOperation]
  }
}

