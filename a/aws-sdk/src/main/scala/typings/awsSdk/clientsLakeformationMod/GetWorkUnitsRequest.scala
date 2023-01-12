package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkUnitsRequest extends StObject {
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The size of each page to get in the Amazon Web Services service call. This does not affect the number of items returned in the command's output. Setting a smaller page size results in more calls to the Amazon Web Services service, retrieving fewer items in each call. This can help prevent the Amazon Web Services service calls from timing out.
    */
  var PageSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the plan query operation.
    */
  var QueryId: GetWorkUnitsRequestQueryIdString
}
object GetWorkUnitsRequest {
  
  inline def apply(QueryId: GetWorkUnitsRequestQueryIdString): GetWorkUnitsRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkUnitsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkUnitsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: Integer): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setQueryId(value: GetWorkUnitsRequestQueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
