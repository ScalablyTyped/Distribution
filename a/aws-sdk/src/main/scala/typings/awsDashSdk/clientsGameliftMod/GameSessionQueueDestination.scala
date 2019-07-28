package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueueDestination extends js.Object {
  /**
    * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a region name, provide a unique identifier across all regions. 
    */
  var DestinationArn: js.UndefOr[ArnStringModel] = js.undefined
}

object GameSessionQueueDestination {
  @scala.inline
  def apply(DestinationArn: ArnStringModel = null): GameSessionQueueDestination = {
    val __obj = js.Dynamic.literal()
    if (DestinationArn != null) __obj.updateDynamic("DestinationArn")(DestinationArn)
    __obj.asInstanceOf[GameSessionQueueDestination]
  }
}

