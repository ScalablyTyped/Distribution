package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsamSettings extends js.Object {
  /**
    * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
    */
  var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.undefined
  /**
    * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
    */
  var ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000] = js.undefined
  /**
    * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing instructions that you provide in the setting SCC XML (sccXml).
    */
  var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.undefined
}

object EsamSettings {
  @scala.inline
  def apply(
    ManifestConfirmConditionNotification: EsamManifestConfirmConditionNotification = null,
    ResponseSignalPreroll: Int | Double = null,
    SignalProcessingNotification: EsamSignalProcessingNotification = null
  ): EsamSettings = {
    val __obj = js.Dynamic.literal()
    if (ManifestConfirmConditionNotification != null) __obj.updateDynamic("ManifestConfirmConditionNotification")(ManifestConfirmConditionNotification)
    if (ResponseSignalPreroll != null) __obj.updateDynamic("ResponseSignalPreroll")(ResponseSignalPreroll.asInstanceOf[js.Any])
    if (SignalProcessingNotification != null) __obj.updateDynamic("SignalProcessingNotification")(SignalProcessingNotification)
    __obj.asInstanceOf[EsamSettings]
  }
}

