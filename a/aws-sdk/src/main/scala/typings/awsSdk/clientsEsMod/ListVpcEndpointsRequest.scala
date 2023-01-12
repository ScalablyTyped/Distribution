package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsRequest extends StObject {
  
  /**
    * Identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object ListVpcEndpointsRequest {
  
  inline def apply(): ListVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
