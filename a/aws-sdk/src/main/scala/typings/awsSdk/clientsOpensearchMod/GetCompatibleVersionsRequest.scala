package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleVersionsRequest extends StObject {
  
  /**
    * The name of an existing domain. Provide this parameter to limit the results to a single domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
}
object GetCompatibleVersionsRequest {
  
  inline def apply(): GetCompatibleVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleVersionsRequest]
  }
  
  extension [Self <: GetCompatibleVersionsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
