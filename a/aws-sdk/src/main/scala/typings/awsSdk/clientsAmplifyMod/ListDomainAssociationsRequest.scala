package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainAssociationsRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  A pagination token. Set to null to start listing apps from the start. If non-null, a pagination token is returned in a result. Pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDomainAssociationsRequest {
  
  inline def apply(appId: AppId): ListDomainAssociationsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsRequest]
  }
  
  extension [Self <: ListDomainAssociationsRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
