package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon FSx resource that you want to tag.
    */
  var ResourceARN: awsDashSdkLib.clientsFsxMod.ResourceARN
  /**
    * A list of tags for the resource. If a tag with a given key already exists, the value is replaced by the one specified in this parameter.
    */
  var Tags: awsDashSdkLib.clientsFsxMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

