package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDestinationResponse extends js.Object {
  /**
    * The destination.
    */
  var destination: js.UndefOr[Destination] = js.undefined
}

object PutDestinationResponse {
  @scala.inline
  def apply(destination: Destination = null): PutDestinationResponse = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    __obj.asInstanceOf[PutDestinationResponse]
  }
}

