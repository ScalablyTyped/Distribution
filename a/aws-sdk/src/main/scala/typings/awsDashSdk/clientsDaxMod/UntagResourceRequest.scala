package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The name of the DAX resource from which the tags should be removed.
    */
  var ResourceName: String = js.native
  /**
    * A list of tag keys. If the DAX cluster has any tags with these keys, then the tags are removed from the cluster.
    */
  var TagKeys: KeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

