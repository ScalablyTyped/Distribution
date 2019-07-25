package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobBookmarksEncryption extends js.Object {
  /**
    * The encryption mode to use for job bookmarks data.
    */
  var JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
}

object JobBookmarksEncryption {
  @scala.inline
  def apply(JobBookmarksEncryptionMode: JobBookmarksEncryptionMode = null, KmsKeyArn: KmsKeyArn = null): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarksEncryptionMode != null) __obj.updateDynamic("JobBookmarksEncryptionMode")(JobBookmarksEncryptionMode.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
}

