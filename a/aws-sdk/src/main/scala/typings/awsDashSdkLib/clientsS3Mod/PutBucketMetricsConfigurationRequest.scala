package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket for which the metrics configuration is set.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: awsDashSdkLib.clientsS3Mod.MetricsConfiguration
}

object PutBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId, MetricsConfiguration: MetricsConfiguration): PutBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id, MetricsConfiguration = MetricsConfiguration)
  
    __obj.asInstanceOf[PutBucketMetricsConfigurationRequest]
  }
}

