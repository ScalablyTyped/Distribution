package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the application to assign the tags.
    */
  var ResourceARN: KinesisAnalyticsARN
  /**
    * The key-value tags to assign to the application.
    */
  var Tags: typings.awsDashSdk.clientsKinesisanalyticsMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

