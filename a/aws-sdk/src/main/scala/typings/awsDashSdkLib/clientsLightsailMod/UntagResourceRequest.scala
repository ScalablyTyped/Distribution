package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The name of the resource from which you are removing a tag.
    */
  var resourceName: ResourceName
  /**
    * The tag keys to delete from the specified resource.
    */
  var tagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

