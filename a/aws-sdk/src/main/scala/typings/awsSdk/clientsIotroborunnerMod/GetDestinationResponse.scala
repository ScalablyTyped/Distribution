package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDestinationResponse extends StObject {
  
  var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
  
  var arn: DestinationArn
  
  var createdAt: js.Date
  
  var id: DestinationId
  
  var name: Name
  
  var site: SiteArn
  
  var state: DestinationState
  
  var updatedAt: js.Date
}
object GetDestinationResponse {
  
  inline def apply(
    arn: DestinationArn,
    createdAt: js.Date,
    id: DestinationId,
    name: Name,
    site: SiteArn,
    state: DestinationState,
    updatedAt: js.Date
  ): GetDestinationResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: DestinationAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setArn(value: DestinationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: DestinationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSite(value: SiteArn): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setState(value: DestinationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
