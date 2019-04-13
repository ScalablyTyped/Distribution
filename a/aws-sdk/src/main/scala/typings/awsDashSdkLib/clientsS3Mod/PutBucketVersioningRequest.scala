package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketVersioningRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[MFA] = js.undefined
  /**
    * 
    */
  var VersioningConfiguration: awsDashSdkLib.clientsS3Mod.VersioningConfiguration
}

object PutBucketVersioningRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    VersioningConfiguration: VersioningConfiguration,
    ContentMD5: ContentMD5 = null,
    MFA: MFA = null
  ): PutBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, VersioningConfiguration = VersioningConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (MFA != null) __obj.updateDynamic("MFA")(MFA)
    __obj.asInstanceOf[PutBucketVersioningRequest]
  }
}

