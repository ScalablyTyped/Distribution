package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignalingChannelEndpointInput extends js.Object {
  /**
    * The ARN of the signalling channel for which you want to get an endpoint.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * A structure containing the endpoint configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterChannelEndpointConfiguration: js.UndefOr[
    typings.awsDashSdk.clientsKinesisvideoMod.SingleMasterChannelEndpointConfiguration
  ] = js.native
}

object GetSignalingChannelEndpointInput {
  @scala.inline
  def apply(
    ChannelARN: ResourceARN,
    SingleMasterChannelEndpointConfiguration: SingleMasterChannelEndpointConfiguration = null
  ): GetSignalingChannelEndpointInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    if (SingleMasterChannelEndpointConfiguration != null) __obj.updateDynamic("SingleMasterChannelEndpointConfiguration")(SingleMasterChannelEndpointConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalingChannelEndpointInput]
  }
}

