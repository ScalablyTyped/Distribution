package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVoiceConnectorTerminationCredentialsResponse extends StObject {
  
  /**
    * A list of user names.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.undefined
}
object ListVoiceConnectorTerminationCredentialsResponse {
  
  @scala.inline
  def apply(): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
  
  @scala.inline
  implicit class ListVoiceConnectorTerminationCredentialsResponseMutableBuilder[Self <: ListVoiceConnectorTerminationCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsernames(value: SensitiveStringList): Self = StObject.set(x, "Usernames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernamesUndefined: Self = StObject.set(x, "Usernames", js.undefined)
    
    @scala.inline
    def setUsernamesVarargs(value: SensitiveString*): Self = StObject.set(x, "Usernames", js.Array(value :_*))
  }
}
