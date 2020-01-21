package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferencePreferenceResponse extends js.Object {
  /**
    * The conference preference.
    */
  var Preference: js.UndefOr[ConferencePreference] = js.native
}

object GetConferencePreferenceResponse {
  @scala.inline
  def apply(Preference: ConferencePreference = null): GetConferencePreferenceResponse = {
    val __obj = js.Dynamic.literal()
    if (Preference != null) __obj.updateDynamic("Preference")(Preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConferencePreferenceResponse]
  }
}

