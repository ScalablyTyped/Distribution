package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasResponse extends StObject {
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of schema summaries.
    */
  var Schemas: js.UndefOr[listOfSchemaSummary] = js.undefined
}
object ListSchemasResponse {
  
  inline def apply(): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasResponse]
  }
  
  extension [Self <: ListSchemasResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemas(value: listOfSchemaSummary): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaSummary*): Self = StObject.set(x, "Schemas", js.Array(value*))
  }
}
