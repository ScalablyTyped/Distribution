package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsRequest extends js.Object {
  /**
    * The Amazon ARN of the resource for which to retrieve tags.
    */
  var ResourceArn: GlueResourceArn
}

object GetTagsRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[GetTagsRequest]
  }
}

