package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDestinationResponse extends js.Object {
  /**
    * The destination.
    */
  var destination: js.UndefOr[Destination] = js.native
}

object PutDestinationResponse {
  @scala.inline
  def apply(destination: Destination = null): PutDestinationResponse = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationResponse]
  }
}

