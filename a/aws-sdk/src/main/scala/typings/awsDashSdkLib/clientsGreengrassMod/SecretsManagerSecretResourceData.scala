package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretsManagerSecretResourceData extends js.Object {
  /**
    * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version (represented by the ''AWSCURRENT'' staging label) is included by default.
    */
  var ARN: js.UndefOr[__string] = js.undefined
  /**
    * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
    */
  var AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string] = js.undefined
}

object SecretsManagerSecretResourceData {
  @scala.inline
  def apply(ARN: __string = null, AdditionalStagingLabelsToDownload: __listOf__string = null): SecretsManagerSecretResourceData = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (AdditionalStagingLabelsToDownload != null) __obj.updateDynamic("AdditionalStagingLabelsToDownload")(AdditionalStagingLabelsToDownload)
    __obj.asInstanceOf[SecretsManagerSecretResourceData]
  }
}

