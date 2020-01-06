package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
  /**
    * The type of the conference provider.
    */
  var ConferenceProviderType: typings.awsDashSdk.clientsAlexaforbusinessMod.ConferenceProviderType = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsDashSdk.clientsAlexaforbusinessMod.MeetingSetting = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.PSTNDialIn] = js.native
}

object UpdateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderArn: Arn,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting,
    IPDialIn: IPDialIn = null,
    PSTNDialIn: PSTNDialIn = null
  ): UpdateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn.asInstanceOf[js.Any])
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConferenceProviderRequest]
  }
}

