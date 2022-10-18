package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostedConfigurationVersionsRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAppconfigMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object ListHostedConfigurationVersionsRequest {
  
  inline def apply(ApplicationId: Id, ConfigurationProfileId: Id): ListHostedConfigurationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedConfigurationVersionsRequest]
  }
  
  extension [Self <: ListHostedConfigurationVersionsRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
