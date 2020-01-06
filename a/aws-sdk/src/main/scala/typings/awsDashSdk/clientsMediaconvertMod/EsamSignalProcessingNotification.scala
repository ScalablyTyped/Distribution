package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsamSignalProcessingNotification extends js.Object {
  /**
    * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. For your MPEG2-TS file outputs, if you want the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
    */
  var SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS] = js.native
}

object EsamSignalProcessingNotification {
  @scala.inline
  def apply(SccXml: __stringPatternSNSignalProcessingNotificationNS = null): EsamSignalProcessingNotification = {
    val __obj = js.Dynamic.literal()
    if (SccXml != null) __obj.updateDynamic("SccXml")(SccXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsamSignalProcessingNotification]
  }
}

