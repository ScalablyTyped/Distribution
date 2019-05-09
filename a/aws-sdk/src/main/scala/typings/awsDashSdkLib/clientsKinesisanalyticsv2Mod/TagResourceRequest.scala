package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

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
  var Tags: awsDashSdkLib.clientsKinesisanalyticsv2Mod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

