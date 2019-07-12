package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the rule for which you want to view tags.
    */
  var ResourceARN: Arn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

