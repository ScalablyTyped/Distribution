package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConferencePreferenceRequest extends StObject {
  
  /**
    * The conference preference of a specific conference provider.
    */
  var ConferencePreference: typings.awsSdk.clientsAlexaforbusinessMod.ConferencePreference
}
object PutConferencePreferenceRequest {
  
  inline def apply(ConferencePreference: ConferencePreference): PutConferencePreferenceRequest = {
    val __obj = js.Dynamic.literal(ConferencePreference = ConferencePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConferencePreferenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConferencePreferenceRequest] (val x: Self) extends AnyVal {
    
    inline def setConferencePreference(value: ConferencePreference): Self = StObject.set(x, "ConferencePreference", value.asInstanceOf[js.Any])
  }
}
