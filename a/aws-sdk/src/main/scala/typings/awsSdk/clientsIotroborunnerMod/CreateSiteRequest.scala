package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteRequest extends StObject {
  
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  var countryCode: SiteCountryCode
  
  var description: js.UndefOr[SiteDescription] = js.undefined
  
  var name: Name
}
object CreateSiteRequest {
  
  inline def apply(countryCode: SiteCountryCode, name: Name): CreateSiteRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSiteRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCountryCode(value: SiteCountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
