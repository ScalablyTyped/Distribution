package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name for a branch. 
    */
  var branchName: BranchName
  
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  A pagination token. Set to null to start listing steps from the start. If a non-null pagination token is returned in a result, pass its value in here to list more steps. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobsRequest {
  
  inline def apply(appId: AppId, branchName: BranchName): ListJobsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
  
  extension [Self <: ListJobsRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
