package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class PutConferencePreferenceRequestOps[Self <: PutConferencePreferenceRequest] (val x: Self) extends AnyVal {
    
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
    def setConferencePreference(value: ConferencePreference): Self = this.set("ConferencePreference", value.asInstanceOf[js.Any])
  }
}
