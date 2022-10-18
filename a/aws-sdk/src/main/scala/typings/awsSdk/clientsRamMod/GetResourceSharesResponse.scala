package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSharesResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain the information about the resource shares.
    */
  var resourceShares: js.UndefOr[ResourceShareList] = js.undefined
}
object GetResourceSharesResponse {
  
  inline def apply(): GetResourceSharesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceSharesResponse]
  }
  
  extension [Self <: GetResourceSharesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceShares(value: ResourceShareList): Self = StObject.set(x, "resourceShares", value.asInstanceOf[js.Any])
    
    inline def setResourceSharesUndefined: Self = StObject.set(x, "resourceShares", js.undefined)
    
    inline def setResourceSharesVarargs(value: ResourceShare*): Self = StObject.set(x, "resourceShares", js.Array(value*))
  }
}
