package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The ID of the file system to back up.
    */
  var FileSystemId: awsDashSdkLib.clientsFsxMod.FileSystemId
  /**
    * The tags to apply to the backup at backup creation. The key value of the Name tag appears in the console as the backup name.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateBackupRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, ClientRequestToken: ClientRequestToken = null, Tags: Tags = null): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateBackupRequest]
  }
}

