package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket from which an analytics configuration is retrieved.
    */
  var Bucket: BucketName
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId
}

object GetBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: AnalyticsId): GetBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationRequest]
  }
}

