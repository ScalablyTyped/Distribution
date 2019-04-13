package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceProvider extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[IPDialIn] = js.undefined
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[MeetingSetting] = js.undefined
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.undefined
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.undefined
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (IPDialIn != null) __obj.updateDynamic("IPDialIn")(IPDialIn)
    if (MeetingSetting != null) __obj.updateDynamic("MeetingSetting")(MeetingSetting)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PSTNDialIn != null) __obj.updateDynamic("PSTNDialIn")(PSTNDialIn)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceProvider]
  }
}

