package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConferencePreferenceRequest extends StObject {
  
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
  implicit class PutConferencePreferenceRequestMutableBuilder[Self <: PutConferencePreferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferencePreference(value: ConferencePreference): Self = StObject.set(x, "ConferencePreference", value.asInstanceOf[js.Any])
  }
}
