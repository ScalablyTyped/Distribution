package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceAttributesResponse extends StObject {
  
  /**
    * The attribute types.
    */
  var Attributes: js.UndefOr[AttributesList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListInstanceAttributesResponse {
  
  inline def apply(): ListInstanceAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceAttributesResponse]
  }
  
  extension [Self <: ListInstanceAttributesResponse](x: Self) {
    
    inline def setAttributes(value: AttributesList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
