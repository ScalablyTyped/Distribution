package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsRequest extends StObject {
  
  /**
    * The ID of the environment. 
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NextToken] = js.undefined
}
object ListApplicationsRequest {
  
  inline def apply(EnvironmentIdentifier: EnvironmentId): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal(EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsRequest]
  }
  
  extension [Self <: ListApplicationsRequest](x: Self) {
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
