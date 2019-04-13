package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateIngestEndpointCredentialsRequest extends js.Object {
  /**
    * The ID of the channel the IngestEndpoint is on.
    */
  var Id: __string
  /**
    * The id of the IngestEndpoint whose credentials should be rotated
    */
  var IngestEndpointId: __string
}

object RotateIngestEndpointCredentialsRequest {
  @scala.inline
  def apply(Id: __string, IngestEndpointId: __string): RotateIngestEndpointCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id, IngestEndpointId = IngestEndpointId)
  
    __obj.asInstanceOf[RotateIngestEndpointCredentialsRequest]
  }
}

