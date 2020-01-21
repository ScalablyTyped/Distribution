package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConferencePreferenceRequest extends js.Object {
  /**
    * The conference preference of a specific conference provider.
    */
  var ConferencePreference: typings.awsSdk.alexaforbusinessMod.ConferencePreference = js.native
}

object PutConferencePreferenceRequest {
  @scala.inline
  def apply(ConferencePreference: ConferencePreference): PutConferencePreferenceRequest = {
    val __obj = js.Dynamic.literal(ConferencePreference = ConferencePreference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutConferencePreferenceRequest]
  }
}

