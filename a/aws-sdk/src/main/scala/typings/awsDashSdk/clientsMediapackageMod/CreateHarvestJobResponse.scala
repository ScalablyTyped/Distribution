package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHarvestJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the HarvestJob.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Channel that the HarvestJob will harvest from.
    */
  var ChannelId: js.UndefOr[__string] = js.undefined
  /**
    * The time the HarvestJob was submitted
    */
  var CreatedAt: js.UndefOr[__string] = js.undefined
  /**
    * The end of the time-window which will be harvested.
    */
  var EndTime: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: js.UndefOr[__string] = js.undefined
  var S3Destination: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.S3Destination] = js.undefined
  /**
    * The start of the time-window which will be harvested.
    */
  var StartTime: js.UndefOr[__string] = js.undefined
  /**
    * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for
  HarvestJobs as they succeed or fail. In the event of failure, the CloudWatch Event will
  include an explanation of why the HarvestJob failed.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Status] = js.undefined
}

object CreateHarvestJobResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    ChannelId: __string = null,
    CreatedAt: __string = null,
    EndTime: __string = null,
    Id: __string = null,
    OriginEndpointId: __string = null,
    S3Destination: S3Destination = null,
    StartTime: __string = null,
    Status: Status = null
  ): CreateHarvestJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (OriginEndpointId != null) __obj.updateDynamic("OriginEndpointId")(OriginEndpointId)
    if (S3Destination != null) __obj.updateDynamic("S3Destination")(S3Destination)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHarvestJobResponse]
  }
}

