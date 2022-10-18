package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFieldsResponse extends StObject {
  
  /**
    * List of detailed field information.
    */
  var fields: ListFieldsResponseFieldsList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFieldsResponse {
  
  inline def apply(fields: ListFieldsResponseFieldsList): ListFieldsResponse = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldsResponse]
  }
  
  extension [Self <: ListFieldsResponse](x: Self) {
    
    inline def setFields(value: ListFieldsResponseFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldSummary*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
