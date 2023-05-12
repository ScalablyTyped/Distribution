package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegenerateSecurityTokenResponse extends StObject {
  
  /**
    * A resource that allows Enterprise account administrators to configure an interface that receives events from Amazon Chime.
    */
  var Bot: js.UndefOr[typings.awsSdk.clientsChimeMod.Bot] = js.undefined
}
object RegenerateSecurityTokenResponse {
  
  inline def apply(): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegenerateSecurityTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
