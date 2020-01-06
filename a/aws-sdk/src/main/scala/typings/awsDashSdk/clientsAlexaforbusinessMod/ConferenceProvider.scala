package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceProvider extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Arn] = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MeetingSetting] = js.native
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.PSTNDialIn] = js.native
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.native
}

object ConferenceProvider {
  @scala.inline
  def apply(
    Arn: Arn = null,
    IPDialIn: IPDialIn = null,
    MeetingSetting: MeetingSetting = null,
    Name: ConferenceProviderName = null,
    PSTNDialIn: PSTNDialIn = null,
    Type: ConferenceProviderType = null
  ): ConferenceProvider = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn.asInstanceOf[js.Any])
    if (MeetingSetting != null) __obj.updateDynamic("MeetingSetting")(MeetingSetting.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceProvider]
  }
}

