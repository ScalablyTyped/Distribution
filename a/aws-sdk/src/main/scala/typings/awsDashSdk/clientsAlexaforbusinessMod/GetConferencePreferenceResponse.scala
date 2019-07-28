package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConferencePreferenceResponse extends js.Object {
  /**
    * The conference preference.
    */
  var Preference: js.UndefOr[ConferencePreference] = js.undefined
}

object GetConferencePreferenceResponse {
  @scala.inline
  def apply(Preference: ConferencePreference = null): GetConferencePreferenceResponse = {
    val __obj = js.Dynamic.literal()
    if (Preference != null) __obj.updateDynamic("Preference")(Preference)
    __obj.asInstanceOf[GetConferencePreferenceResponse]
  }
}

