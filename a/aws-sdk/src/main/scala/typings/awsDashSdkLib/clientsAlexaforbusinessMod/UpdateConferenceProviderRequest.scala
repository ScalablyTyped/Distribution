package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn
  /**
    * The type of the conference provider.
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

object UpdateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderArn: Arn,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting,
    IPDialIn: IPDialIn = null,
    PSTNDialIn: PSTNDialIn = null
  ): UpdateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn, ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting)
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn)
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn)
    __obj.asInstanceOf[UpdateConferenceProviderRequest]
  }
}

