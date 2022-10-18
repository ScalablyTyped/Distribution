package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttributeGroupsForApplicationRequest extends StObject {
  
  /**
    * The name or ID of the application.
    */
  var application: ApplicationSpecifier
  
  /**
    * The upper bound of the number of results to return. The value cannot exceed 25. If you omit this parameter, it defaults to 25. This value is optional.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * This token retrieves the next page of results after a previous API call.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAttributeGroupsForApplicationRequest {
  
  inline def apply(application: ApplicationSpecifier): ListAttributeGroupsForApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttributeGroupsForApplicationRequest]
  }
  
  extension [Self <: ListAttributeGroupsForApplicationRequest](x: Self) {
    
    inline def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
