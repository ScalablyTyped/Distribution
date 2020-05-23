package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a transfer activity. */
trait TransferResult extends js.Object {
  /** Either void if the transfer has been carried out successfully, or an exception indicating the kind of failure. */
  var Result: js.Any
  /** The URL of the source object. */
  var Source: String
  /** The URL of the target folder into which to transfer (a copy of) the source object. */
  var Target: String
}

object TransferResult {
  @scala.inline
  def apply(Result: js.Any, Source: String, Target: String): TransferResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferResult]
  }
}

