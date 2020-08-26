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
  def apply(): GetConferencePreferenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferencePreferenceResponse]
  }
  @scala.inline
  implicit class GetConferencePreferenceResponseOps[Self <: GetConferencePreferenceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreference(value: ConferencePreference): Self = this.set("Preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("Preference", js.undefined)
  }
  
}

