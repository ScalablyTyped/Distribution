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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDomainNameResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainNameConfig(value: DomainNameConfig): Self = StObject.set(x, "domainNameConfig", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigUndefined: Self = StObject.set(x, "domainNameConfig", js.undefined)
  }
}
