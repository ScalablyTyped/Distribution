package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataEndpointInput extends js.Object {
  /**
    * The name of the API action for which to get an endpoint.
    */
  var APIName: typings.awsDashSdk.clientsKinesisvideoMod.APIName
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamName in the request. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a StreamARN in the request.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}

object GetDataEndpointInput {
  @scala.inline
  def apply(APIName: APIName, StreamARN: ResourceARN = null, StreamName: StreamName = null): GetDataEndpointInput = {
    val __obj = js.Dynamic.literal(APIName = APIName.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[GetDataEndpointInput]
  }
}

