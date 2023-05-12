package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteResponse extends StObject {
  
  var arn: SiteArn
  
  var countryCode: SiteCountryCode
  
  var createdAt: js.Date
  
  var description: js.UndefOr[SiteDescription] = js.undefined
  
  var id: SiteId
  
  var name: Name
  
  var updatedAt: js.Date
}
object GetSiteResponse {
  
  inline def apply(
    arn: SiteArn,
    countryCode: SiteCountryCode,
    createdAt: js.Date,
    id: SiteId,
    name: Name,
    updatedAt: js.Date
  ): GetSiteResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SiteArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: SiteCountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SiteId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
