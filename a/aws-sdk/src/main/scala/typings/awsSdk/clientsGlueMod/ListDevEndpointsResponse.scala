package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevEndpointsResponse extends StObject {
  
  /**
    * The names of all the DevEndpoints in the account, or the DevEndpoints with the specified tags.
    */
  var DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.undefined
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListDevEndpointsResponse {
  
  inline def apply(): ListDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevEndpointsResponse]
  }
  
  extension [Self <: ListDevEndpointsResponse](x: Self) {
    
    inline def setDevEndpointNames(value: DevEndpointNameList): Self = StObject.set(x, "DevEndpointNames", value.asInstanceOf[js.Any])
    
    inline def setDevEndpointNamesUndefined: Self = StObject.set(x, "DevEndpointNames", js.undefined)
    
    inline def setDevEndpointNamesVarargs(value: NameString*): Self = StObject.set(x, "DevEndpointNames", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
