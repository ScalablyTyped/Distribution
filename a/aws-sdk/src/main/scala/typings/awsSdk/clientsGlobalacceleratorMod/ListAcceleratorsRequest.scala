package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAcceleratorsRequest extends StObject {
  
  /**
    * The number of Global Accelerator objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListAcceleratorsRequest {
  
  inline def apply(): ListAcceleratorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceleratorsRequest]
  }
  
  extension [Self <: ListAcceleratorsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
