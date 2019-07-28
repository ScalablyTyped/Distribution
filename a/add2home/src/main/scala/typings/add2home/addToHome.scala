package typings.add2home

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addToHome")
@js.native
object addToHome extends js.Object {
  /** Closes the popup. */
  def close(): Unit = js.native
  /** Reset the local and session storages so the popup will show again (for automatic mode - has no affect if manually opening the popup). */
  def reset(): Unit = js.native
  /** Shows the popup.
    * @param {boolean} overrideChecks Override all the compatibility checks and always show the popup.
    */
  def show(overrideChecks: Boolean): Unit = js.native
}

