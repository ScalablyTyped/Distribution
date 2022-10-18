package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListV2LoggingLevelsResponse extends StObject {
  
  /**
    * The logging configuration for a target.
    */
  var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListV2LoggingLevelsResponse {
  
  inline def apply(): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
  
  extension [Self <: ListV2LoggingLevelsResponse](x: Self) {
    
    inline def setLogTargetConfigurations(value: LogTargetConfigurations): Self = StObject.set(x, "logTargetConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLogTargetConfigurationsUndefined: Self = StObject.set(x, "logTargetConfigurations", js.undefined)
    
    inline def setLogTargetConfigurationsVarargs(value: LogTargetConfiguration*): Self = StObject.set(x, "logTargetConfigurations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
