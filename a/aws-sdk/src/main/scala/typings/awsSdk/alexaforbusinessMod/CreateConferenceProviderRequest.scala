package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceProviderRequest extends js.Object {
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typings.awsSdk.alexaforbusinessMod.ConferenceProviderName = js.native
  /**
    * Represents a type within a list of predefined types.
    */
  var ConferenceProviderType: typings.awsSdk.alexaforbusinessMod.ConferenceProviderType = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsSdk.alexaforbusinessMod.MeetingSetting = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
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

