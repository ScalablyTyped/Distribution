package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresignedUrlConfig extends js.Object {
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
    */
  var expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined
  /**
    * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object PresignedUrlConfig {
  @scala.inline
  def apply(expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined, roleArn: RoleArn = null): PresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresInSec)) __obj.updateDynamic("expiresInSec")(expiresInSec)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[PresignedUrlConfig]
  }
}

