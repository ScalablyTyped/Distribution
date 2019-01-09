package typings
package add2homeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addToHome")
@js.native
object addToHome extends js.Object {
  /** Closes the popup. */
  def close(): scala.Unit = js.native
  /** Reset the local and session storages so the popup will show again (for automatic mode - has no affect if manually opening the popup). */
  def reset(): scala.Unit = js.native
  /** Shows the popup.
    * @param {boolean} overrideChecks Override all the compatibility checks and always show the popup.
    */
  def show(overrideChecks: scala.Boolean): scala.Unit = js.native
}

