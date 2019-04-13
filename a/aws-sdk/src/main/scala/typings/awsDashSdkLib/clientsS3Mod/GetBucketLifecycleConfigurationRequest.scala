package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleConfigurationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketLifecycleConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketLifecycleConfigurationRequest]
  }
}

