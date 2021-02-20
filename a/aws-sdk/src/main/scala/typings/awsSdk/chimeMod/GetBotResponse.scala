package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotResponse extends StObject {
  
  /**
    * The chat bot details.
    */
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.native
}
object GetBotResponse {
  
  @scala.inline
  def apply(): GetBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotResponse]
  }
  
  @scala.inline
  implicit class GetBotResponseMutableBuilder[Self <: GetBotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
