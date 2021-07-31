package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegenerateSecurityTokenResponse extends StObject {
  
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.undefined
}
object RegenerateSecurityTokenResponse {
  
  @scala.inline
  def apply(): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
  
  @scala.inline
  implicit class RegenerateSecurityTokenResponseMutableBuilder[Self <: RegenerateSecurityTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
