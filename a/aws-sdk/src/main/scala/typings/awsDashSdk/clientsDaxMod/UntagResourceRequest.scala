package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The name of the DAX resource from which the tags should be removed.
    */
  var ResourceName: String
  /**
    * A list of tag keys. If the DAX cluster has any tags with these keys, then the tags are removed from the cluster.
    */
  var TagKeys: KeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

