package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the application to assign the tags.
    */
  var ResourceARN: KinesisAnalyticsARN = js.native
  /**
    * The key-value tags to assign to the application.
    */
  var Tags: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

