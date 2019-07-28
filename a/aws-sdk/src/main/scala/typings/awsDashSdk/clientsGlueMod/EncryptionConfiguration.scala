package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption configuration for Amazon CloudWatch.
    */
  var CloudWatchEncryption: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CloudWatchEncryption] = js.undefined
  /**
    * The encryption configuration for job bookmarks.
    */
  var JobBookmarksEncryption: js.UndefOr[typings.awsDashSdk.clientsGlueMod.JobBookmarksEncryption] = js.undefined
  /**
    * The encryption configuration for Amazon Simple Storage Service (Amazon S3) data.
    */
  var S3Encryption: js.UndefOr[S3EncryptionList] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(
    CloudWatchEncryption: CloudWatchEncryption = null,
    JobBookmarksEncryption: JobBookmarksEncryption = null,
    S3Encryption: S3EncryptionList = null
  ): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchEncryption != null) __obj.updateDynamic("CloudWatchEncryption")(CloudWatchEncryption)
    if (JobBookmarksEncryption != null) __obj.updateDynamic("JobBookmarksEncryption")(JobBookmarksEncryption)
    if (S3Encryption != null) __obj.updateDynamic("S3Encryption")(S3Encryption)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

