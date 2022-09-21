package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstancesResponse extends StObject {
  
  /**
    * The information for each AppInstance.
    */
  var AppInstances: js.UndefOr[AppInstanceList] = js.undefined
  
  /**
    * The token passed by previous API requests until the maximum number of AppInstances is reached.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstancesResponse {
  
  inline def apply(): ListAppInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstancesResponse]
  }
  
  extension [Self <: ListAppInstancesResponse](x: Self) {
    
    inline def setAppInstances(value: AppInstanceList): Self = StObject.set(x, "AppInstances", value.asInstanceOf[js.Any])
    
    inline def setAppInstancesUndefined: Self = StObject.set(x, "AppInstances", js.undefined)
    
    inline def setAppInstancesVarargs(value: AppInstanceSummary*): Self = StObject.set(x, "AppInstances", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
