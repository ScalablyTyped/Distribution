package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessGatewayTaskDefinitionsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * The list of task definitions.
    */
  var TaskDefinitions: js.UndefOr[WirelessGatewayTaskDefinitionList] = js.undefined
}
object ListWirelessGatewayTaskDefinitionsResponse {
  
  inline def apply(): ListWirelessGatewayTaskDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessGatewayTaskDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWirelessGatewayTaskDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskDefinitions(value: WirelessGatewayTaskDefinitionList): Self = StObject.set(x, "TaskDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionsUndefined: Self = StObject.set(x, "TaskDefinitions", js.undefined)
    
    inline def setTaskDefinitionsVarargs(value: UpdateWirelessGatewayTaskEntry*): Self = StObject.set(x, "TaskDefinitions", js.Array(value*))
  }
}
