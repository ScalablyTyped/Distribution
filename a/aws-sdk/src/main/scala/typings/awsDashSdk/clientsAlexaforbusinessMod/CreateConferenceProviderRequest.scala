package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceProviderRequest extends js.Object {
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typings.awsDashSdk.clientsAlexaforbusinessMod.ConferenceProviderName = js.native
  /**
    * Represents a type within a list of predefined types.
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

object CreateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderName: ConferenceProviderName,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting,
    ClientRequestToken: ClientRequestToken = null,
    IPDialIn: IPDialIn = null,
    PSTNDialIn: PSTNDialIn = null
  ): CreateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderName = ConferenceProviderName.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn.asInstanceOf[js.Any])
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceProviderRequest]
  }
}

