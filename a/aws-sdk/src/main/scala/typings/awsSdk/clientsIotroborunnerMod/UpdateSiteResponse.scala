package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteResponse extends StObject {
  
  var arn: SiteArn
  
  var countryCode: js.UndefOr[SiteCountryCode] = js.undefined
  
  var description: js.UndefOr[SiteDescription] = js.undefined
  
  var id: SiteId
  
  var name: Name
  
  var updatedAt: js.Date
}
object UpdateSiteResponse {
  
  inline def apply(arn: SiteArn, id: SiteId, name: Name, updatedAt: js.Date): UpdateSiteResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SiteArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: SiteCountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SiteId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
