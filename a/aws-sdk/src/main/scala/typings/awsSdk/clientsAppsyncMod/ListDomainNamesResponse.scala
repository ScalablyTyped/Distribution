package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainNamesResponse extends StObject {
  
  /**
    * Lists configurations for multiple domain names.
    */
  var domainNameConfigs: js.UndefOr[DomainNameConfigs] = js.undefined
  
  /**
    * The API token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDomainNamesResponse {
  
  inline def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  
  extension [Self <: ListDomainNamesResponse](x: Self) {
    
    inline def setDomainNameConfigs(value: DomainNameConfigs): Self = StObject.set(x, "domainNameConfigs", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigsUndefined: Self = StObject.set(x, "domainNameConfigs", js.undefined)
    
    inline def setDomainNameConfigsVarargs(value: DomainNameConfig*): Self = StObject.set(x, "domainNameConfigs", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
