package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRequest extends StObject {
  
  /**
    * A token that indicates where the output should continue from, if a previous operation did not show all results. To get the next results, call the operation again with this value.
    */
  var nextToken: js.UndefOr[ListRequestNextTokenString] = js.undefined
  
  /**
    * The number of resources in the paginated list. 
    */
  var pageSize: js.UndefOr[Integer] = js.undefined
}
object ListRequest {
  
  inline def apply(): ListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ListRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPageSize(value: Integer): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
