package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the application for which to retrieve tags.
    */
  var ResourceARN: KinesisAnalyticsARN
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

