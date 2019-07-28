package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  var ResourceARN: ResourceArn
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

