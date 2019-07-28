package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketAnalyticsConfigurationRequest extends js.Object {
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: typings.awsDashSdk.clientsS3Mod.AnalyticsConfiguration
  /**
    * The name of the bucket to which an analytics configuration is stored.
    */
  var Bucket: BucketName
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId
}

object PutBucketAnalyticsConfigurationRequest {
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: BucketName, Id: AnalyticsId): PutBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration, Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationRequest]
  }
}

