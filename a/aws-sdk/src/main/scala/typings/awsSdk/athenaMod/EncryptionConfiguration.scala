package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup. 
    */
  var EncryptionOption: typings.awsSdk.athenaMod.EncryptionOption = js.native
  /**
    * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
    */
  var KmsKey: js.UndefOr[String] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(EncryptionOption: EncryptionOption): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(EncryptionOption = EncryptionOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncryptionOption(value: EncryptionOption): Self = this.set("EncryptionOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKey(value: String): Self = this.set("KmsKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKey: Self = this.set("KmsKey", js.undefined)
  }
  
}

