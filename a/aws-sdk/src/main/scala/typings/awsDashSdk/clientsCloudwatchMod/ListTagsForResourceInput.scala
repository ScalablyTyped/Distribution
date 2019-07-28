package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * The ARN of the CloudWatch resource that you want to view tags for. For more information on ARN format, see Example ARNs in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

