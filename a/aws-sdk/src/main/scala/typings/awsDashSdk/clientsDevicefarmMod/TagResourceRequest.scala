package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource(s) to which to add tags. You can associate tags with the following Device Farm resources: PROJECT, RUN, NETWORK_PROFILE, INSTANCE_PROFILE, DEVICE_INSTANCE, SESSION, DEVICE_POOL, DEVICE, and VPCE_CONFIGURATION.
    */
  var ResourceARN: AmazonResourceName
  /**
    * The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

