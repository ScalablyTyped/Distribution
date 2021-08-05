package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedFleetsRequest extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack.
    */
  var StackName: String
}
object ListAssociatedFleetsRequest {
  
  inline def apply(StackName: String): ListAssociatedFleetsRequest = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedFleetsRequest]
  }
  
  extension [Self <: ListAssociatedFleetsRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
