package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegistriesResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
  
  /**
    * An array of RegistryDetailedListItem objects containing minimal details of each registry.
    */
  var Registries: js.UndefOr[RegistryListDefinition] = js.undefined
}
object ListRegistriesResponse {
  
  inline def apply(): ListRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesResponse]
  }
  
  extension [Self <: ListRegistriesResponse](x: Self) {
    
    inline def setNextToken(value: SchemaRegistryTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegistries(value: RegistryListDefinition): Self = StObject.set(x, "Registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesUndefined: Self = StObject.set(x, "Registries", js.undefined)
    
    inline def setRegistriesVarargs(value: RegistryListItem*): Self = StObject.set(x, "Registries", js.Array(value*))
  }
}
