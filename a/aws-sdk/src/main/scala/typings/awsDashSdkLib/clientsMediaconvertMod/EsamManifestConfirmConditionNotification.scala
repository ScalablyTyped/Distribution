package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsamManifestConfirmConditionNotification extends js.Object {
  /**
    * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the message that you supply.
    */
  var MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS] = js.undefined
}

object EsamManifestConfirmConditionNotification {
  @scala.inline
  def apply(MccXml: __stringPatternSNManifestConfirmConditionNotificationNS = null): EsamManifestConfirmConditionNotification = {
    val __obj = js.Dynamic.literal()
    if (MccXml != null) __obj.updateDynamic("MccXml")(MccXml)
    __obj.asInstanceOf[EsamManifestConfirmConditionNotification]
  }
}

