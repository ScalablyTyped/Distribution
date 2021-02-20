package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConferencePreferenceResponse extends StObject {
  
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
  implicit class GetConferencePreferenceResponseMutableBuilder[Self <: GetConferencePreferenceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreference(value: ConferencePreference): Self = StObject.set(x, "Preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "Preference", js.undefined)
  }
}
