package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectLockConfigurationRequest extends js.Object {
  /**
    * The bucket whose Object Lock configuration you want to retrieve.
    */
  var Bucket: BucketName
}

object GetObjectLockConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetObjectLockConfigurationRequest]
  }
}

