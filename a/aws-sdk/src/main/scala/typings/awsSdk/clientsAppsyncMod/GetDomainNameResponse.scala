package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNameResponse extends StObject {
  
  /**
    * The configuration for the DomainName.
    */
  var domainNameConfig: js.UndefOr[DomainNameConfig] = js.undefined
}
object GetDomainNameResponse {
  
  inline def apply(): GetDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainNameResponse]
  }
  
  extension [Self <: GetDomainNameResponse](x: Self) {
    
    inline def setDomainNameConfig(value: DomainNameConfig): Self = StObject.set(x, "domainNameConfig", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigUndefined: Self = StObject.set(x, "domainNameConfig", js.undefined)
  }
}
