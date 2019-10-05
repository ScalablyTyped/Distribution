package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHarvestJobRequest extends js.Object {
  /**
    * The end of the time-window which will be harvested
    */
  var EndTime: __string
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted
    */
  var Id: __string
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: __string
  var S3Destination: typings.awsDashSdk.clientsMediapackageMod.S3Destination
  /**
    * The start of the time-window which will be harvested
    */
  var StartTime: __string
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
    val __obj = js.Dynamic.literal(EndTime = EndTime, Id = Id, OriginEndpointId = OriginEndpointId, S3Destination = S3Destination, StartTime = StartTime)
  
    __obj.asInstanceOf[CreateHarvestJobRequest]
  }
}

