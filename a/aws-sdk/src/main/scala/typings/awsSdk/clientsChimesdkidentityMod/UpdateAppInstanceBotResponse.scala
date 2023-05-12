package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceBotResponse extends StObject {
  
  /**
    * The ARN of the AppInstanceBot.
    */
  var AppInstanceBotArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateAppInstanceBotResponse {
  
  inline def apply(): UpdateAppInstanceBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceBotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppInstanceBotResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotArnUndefined: Self = StObject.set(x, "AppInstanceBotArn", js.undefined)
  }
}
