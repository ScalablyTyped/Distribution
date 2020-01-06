package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSdtSettings extends js.Object {
  /**
    * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[__integerMin25Max2000] = js.native
  /**
    * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[__stringMin1Max256] = js.native
  /**
    * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.native
}

object DvbSdtSettings {
  @scala.inline
  def apply(
    OutputSdt: DvbSdtOutputSdt = null,
    RepInterval: Int | Double = null,
    ServiceName: __stringMin1Max256 = null,
    ServiceProviderName: __stringMin1Max256 = null
  ): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    if (OutputSdt != null) __obj.updateDynamic("OutputSdt")(OutputSdt.asInstanceOf[js.Any])
    if (RepInterval != null) __obj.updateDynamic("RepInterval")(RepInterval.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceProviderName != null) __obj.updateDynamic("ServiceProviderName")(ServiceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSdtSettings]
  }
}

