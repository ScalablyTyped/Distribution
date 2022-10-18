package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
  
  /**
    * An array of SchemaListItem objects containing details of each schema.
    */
  var Schemas: js.UndefOr[SchemaListDefinition] = js.undefined
}
object ListSchemasResponse {
  
  inline def apply(): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasResponse]
  }
  
  extension [Self <: ListSchemasResponse](x: Self) {
    
    inline def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemas(value: SchemaListDefinition): Self = StObject.set(x, "Schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "Schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaListItem*): Self = StObject.set(x, "Schemas", js.Array(value*))
  }
}
