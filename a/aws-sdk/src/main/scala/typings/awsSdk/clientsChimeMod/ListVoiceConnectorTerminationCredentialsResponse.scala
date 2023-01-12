package typings.awsSdk.clientsChimeMod

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
  
  inline def apply(): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVoiceConnectorTerminationCredentialsResponse] (val x: Self) extends AnyVal {
    
    inline def setUsernames(value: SensitiveStringList): Self = StObject.set(x, "Usernames", value.asInstanceOf[js.Any])
    
    inline def setUsernamesUndefined: Self = StObject.set(x, "Usernames", js.undefined)
    
    inline def setUsernamesVarargs(value: SensitiveString*): Self = StObject.set(x, "Usernames", js.Array(value*))
  }
}
