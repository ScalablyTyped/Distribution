package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsRequest extends StObject {
  
  /**
    * The filter for the list of deployments. Choose one of the following options:    ALL – The list includes all deployments.    LATEST_ONLY – The list includes only the latest revision of each deployment.   Default: LATEST_ONLY 
    */
  var historyFilter: js.UndefOr[DeploymentHistoryFilter] = js.undefined
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The parent deployment's target ARN within a subdeployment.
    */
  var parentTargetArn: js.UndefOr[ThingGroupARN] = js.undefined
  
  /**
    * The ARN of the target IoT thing or thing group.
    */
  var targetArn: js.UndefOr[TargetARN] = js.undefined
}
object ListDeploymentsRequest {
  
  inline def apply(): ListDeploymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeploymentsRequest] (val x: Self) extends AnyVal {
    
    inline def setHistoryFilter(value: DeploymentHistoryFilter): Self = StObject.set(x, "historyFilter", value.asInstanceOf[js.Any])
    
    inline def setHistoryFilterUndefined: Self = StObject.set(x, "historyFilter", js.undefined)
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setParentTargetArn(value: ThingGroupARN): Self = StObject.set(x, "parentTargetArn", value.asInstanceOf[js.Any])
    
    inline def setParentTargetArnUndefined: Self = StObject.set(x, "parentTargetArn", js.undefined)
    
    inline def setTargetArn(value: TargetARN): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
