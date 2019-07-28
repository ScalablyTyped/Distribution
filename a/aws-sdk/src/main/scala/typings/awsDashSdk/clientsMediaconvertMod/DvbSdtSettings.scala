package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbSdtSettings extends js.Object {
  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.OutputSdt] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined
  /**
    * The service name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined
  /**
    * The service provider name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
}

object DvbSdtSettings {
  @scala.inline
  def apply(
    OutputSdt: OutputSdt = null,
    SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
    ServiceName: __stringMin1Max256 = null,
    ServiceProviderName: __stringMin1Max256 = null
  ): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    if (OutputSdt != null) __obj.updateDynamic("OutputSdt")(OutputSdt.asInstanceOf[js.Any])
    if (!js.isUndefined(SdtInterval)) __obj.updateDynamic("SdtInterval")(SdtInterval)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (ServiceProviderName != null) __obj.updateDynamic("ServiceProviderName")(ServiceProviderName)
    __obj.asInstanceOf[DvbSdtSettings]
  }
}

