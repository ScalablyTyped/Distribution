package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceBotResponse extends StObject {
  
  /**
    * The ARN of the AppinstanceBot.
    */
  var AppInstanceBotArn: js.UndefOr[ChimeArn] = js.undefined
}
object CreateAppInstanceBotResponse {
  
  inline def apply(): CreateAppInstanceBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceBotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppInstanceBotResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotArnUndefined: Self = StObject.set(x, "AppInstanceBotArn", js.undefined)
  }
}
