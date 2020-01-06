package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentOutput extends js.Object {
  /**
    * The array of results.
    */
  var Payload: js.UndefOr[SelectObjectContentEventStream] = js.native
}

object SelectObjectContentOutput {
  @scala.inline
  def apply(Payload: SelectObjectContentEventStream = null): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
}

