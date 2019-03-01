package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a transfer activity. */
trait TransferResult extends js.Object {
  /** Either void if the transfer has been carried out successfully, or an exception indicating the kind of failure. */
  var Result: js.Any
  /** The URL of the source object. */
  var Source: java.lang.String
  /** The URL of the target folder into which to transfer (a copy of) the source object. */
  var Target: java.lang.String
}

object TransferResult {
  @scala.inline
  def apply(Result: js.Any, Source: java.lang.String, Target: java.lang.String): TransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Result")(Result)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[TransferResult]
  }
}

