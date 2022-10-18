package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConferencePreferenceResponse extends StObject {
  
  /**
    * The conference preference.
    */
  var Preference: js.UndefOr[ConferencePreference] = js.undefined
}
object GetConferencePreferenceResponse {
  
  inline def apply(): GetConferencePreferenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConferencePreferenceResponse]
  }
  
  extension [Self <: GetConferencePreferenceResponse](x: Self) {
    
    inline def setPreference(value: ConferencePreference): Self = StObject.set(x, "Preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "Preference", js.undefined)
  }
}
