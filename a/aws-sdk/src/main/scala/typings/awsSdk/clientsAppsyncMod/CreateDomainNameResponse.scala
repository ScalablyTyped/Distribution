package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainNameResponse extends StObject {
  
  /**
    * The configuration for the DomainName.
    */
  var domainNameConfig: js.UndefOr[DomainNameConfig] = js.undefined
}
object CreateDomainNameResponse {
  
  inline def apply(): CreateDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainNameResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainNameResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainNameConfig(value: DomainNameConfig): Self = StObject.set(x, "domainNameConfig", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigUndefined: Self = StObject.set(x, "domainNameConfig", js.undefined)
  }
}
