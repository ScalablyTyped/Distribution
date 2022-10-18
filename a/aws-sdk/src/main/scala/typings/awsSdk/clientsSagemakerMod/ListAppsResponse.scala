package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsResponse extends StObject {
  
  /**
    * The list of apps.
    */
  var Apps: js.UndefOr[AppList] = js.undefined
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListAppsResponse {
  
  inline def apply(): ListAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsResponse]
  }
  
  extension [Self <: ListAppsResponse](x: Self) {
    
    inline def setApps(value: AppList): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    inline def setAppsVarargs(value: AppDetails*): Self = StObject.set(x, "Apps", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
