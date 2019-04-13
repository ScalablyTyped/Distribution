package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the resource whose tags you want to list.
    */
  var resourceArn: ResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: ResourceArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

