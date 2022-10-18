package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApprovedOriginsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The approved origins.
    */
  var Origins: js.UndefOr[OriginsList] = js.undefined
}
object ListApprovedOriginsResponse {
  
  inline def apply(): ListApprovedOriginsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovedOriginsResponse]
  }
  
  extension [Self <: ListApprovedOriginsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrigins(value: OriginsList): Self = StObject.set(x, "Origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "Origins", js.undefined)
    
    inline def setOriginsVarargs(value: Origin*): Self = StObject.set(x, "Origins", js.Array(value*))
  }
}
