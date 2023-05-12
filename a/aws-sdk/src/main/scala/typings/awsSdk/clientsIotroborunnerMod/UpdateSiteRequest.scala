package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteRequest extends StObject {
  
  var countryCode: js.UndefOr[SiteCountryCode] = js.undefined
  
  var description: js.UndefOr[SiteDescription] = js.undefined
  
  var id: SiteGenericIdentifier
  
  var name: js.UndefOr[Name] = js.undefined
}
object UpdateSiteRequest {
  
  inline def apply(id: SiteGenericIdentifier): UpdateSiteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSiteRequest] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: SiteCountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SiteGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
