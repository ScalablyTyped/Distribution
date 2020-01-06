package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateIngestEndpointCredentialsRequest extends js.Object {
  /**
    * The ID of the channel the IngestEndpoint is on.
    */
  var Id: __string = js.native
  /**
    * The id of the IngestEndpoint whose credentials should be rotated
    */
  var IngestEndpointId: __string = js.native
}

object RotateIngestEndpointCredentialsRequest {
  @scala.inline
  def apply(Id: __string, IngestEndpointId: __string): RotateIngestEndpointCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IngestEndpointId = IngestEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RotateIngestEndpointCredentialsRequest]
  }
}

