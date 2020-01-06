package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHarvestJobRequest extends js.Object {
  /**
    * The end of the time-window which will be harvested
    */
  var EndTime: __string = js.native
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted
    */
  var Id: __string = js.native
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: __string = js.native
  var S3Destination: typings.awsDashSdk.clientsMediapackageMod.S3Destination = js.native
  /**
    * The start of the time-window which will be harvested
    */
  var StartTime: __string = js.native
}

object CreateHarvestJobRequest {
  @scala.inline
  def apply(
    EndTime: __string,
    Id: __string,
    OriginEndpointId: __string,
    S3Destination: S3Destination,
    StartTime: __string
  ): CreateHarvestJobRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginEndpointId = OriginEndpointId.asInstanceOf[js.Any], S3Destination = S3Destination.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateHarvestJobRequest]
  }
}

