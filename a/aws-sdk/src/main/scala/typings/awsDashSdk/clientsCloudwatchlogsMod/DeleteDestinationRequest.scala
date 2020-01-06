package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDestinationRequest extends js.Object {
  /**
    * The name of the destination.
    */
  var destinationName: DestinationName = js.native
}

object DeleteDestinationRequest {
  @scala.inline
  def apply(destinationName: DestinationName): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
}

