package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBotResponse extends StObject {
  
  /**
    * The updated bot details.
    */
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.native
}
object UpdateBotResponse {
  
  @scala.inline
  def apply(): UpdateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBotResponse]
  }
  
  @scala.inline
  implicit class UpdateBotResponseMutableBuilder[Self <: UpdateBotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
