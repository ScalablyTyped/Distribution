package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceBotsResponse extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The information for each requested AppInstanceBot.
    */
  var AppInstanceBots: js.UndefOr[AppInstanceBotList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested bots are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstanceBotsResponse {
  
  inline def apply(): ListAppInstanceBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceBotsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppInstanceBotsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    inline def setAppInstanceBots(value: AppInstanceBotList): Self = StObject.set(x, "AppInstanceBots", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotsUndefined: Self = StObject.set(x, "AppInstanceBots", js.undefined)
    
    inline def setAppInstanceBotsVarargs(value: AppInstanceBotSummary*): Self = StObject.set(x, "AppInstanceBots", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
