package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConferenceProviderRequest extends js.Object {
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: awsDashSdkLib.clientsAlexaforbusinessMod.ConferenceProviderName
  /**
    * Represents a type within a list of predefined types.
    */
  var ConferenceProviderType: awsDashSdkLib.clientsAlexaforbusinessMod.ConferenceProviderType
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[IPDialIn] = js.undefined
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: awsDashSdkLib.clientsAlexaforbusinessMod.MeetingSetting
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
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
    val __obj = js.Dynamic.literal(ConferenceProviderName = ConferenceProviderName, ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn)
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn)
    __obj.asInstanceOf[CreateConferenceProviderRequest]
  }
}

