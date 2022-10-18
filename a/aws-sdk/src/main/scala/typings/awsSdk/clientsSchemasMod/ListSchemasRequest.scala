package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasRequest extends StObject {
  
  var Limit: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * Specifying this limits the results to only those schema names that start with the specified prefix.
    */
  var SchemaNamePrefix: js.UndefOr[string] = js.undefined
}
object ListSchemasRequest {
  
  inline def apply(RegistryName: string): ListSchemasRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasRequest]
  }
  
  extension [Self <: ListSchemasRequest](x: Self) {
    
    inline def setLimit(value: integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNamePrefix(value: string): Self = StObject.set(x, "SchemaNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setSchemaNamePrefixUndefined: Self = StObject.set(x, "SchemaNamePrefix", js.undefined)
  }
}
