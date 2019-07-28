package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource(s) for which to list tags. You can associate tags with the following Device Farm resources: PROJECT, RUN, NETWORK_PROFILE, INSTANCE_PROFILE, DEVICE_INSTANCE, SESSION, DEVICE_POOL, DEVICE, and VPCE_CONFIGURATION.
    */
  var ResourceARN: AmazonResourceName
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

