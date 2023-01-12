package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceUserEndpointsRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: SensitiveChimeArn
  
  /**
    * The maximum number of endpoints that you want to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested endpoints are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstanceUserEndpointsRequest {
  
  inline def apply(AppInstanceUserArn: SensitiveChimeArn): ListAppInstanceUserEndpointsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInstanceUserEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppInstanceUserEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
