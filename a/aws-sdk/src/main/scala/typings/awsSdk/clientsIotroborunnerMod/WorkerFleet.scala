package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerFleet extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
  
  var arn: WorkerFleetArn
  
  var createdAt: js.Date
  
  var id: WorkerFleetId
  
  var name: Name
  
  var site: SiteArn
  
  var updatedAt: js.Date
}
object WorkerFleet {
  
  inline def apply(
    arn: WorkerFleetArn,
    createdAt: js.Date,
    id: WorkerFleetId,
    name: Name,
    site: SiteArn,
    updatedAt: js.Date
  ): WorkerFleet = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerFleet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerFleet] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerFleetAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setArn(value: WorkerFleetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkerFleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSite(value: SiteArn): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
