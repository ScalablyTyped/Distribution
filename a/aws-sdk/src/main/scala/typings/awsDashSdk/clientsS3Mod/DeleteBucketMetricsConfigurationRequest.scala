package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the metrics configuration to delete.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
}

object DeleteBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId): DeleteBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[DeleteBucketMetricsConfigurationRequest]
  }
}

