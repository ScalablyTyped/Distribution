package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerFleetRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
  
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  var name: Name
  
  var site: SiteGenericIdentifier
}
object CreateWorkerFleetRequest {
  
  inline def apply(name: Name, site: SiteGenericIdentifier): CreateWorkerFleetRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkerFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerFleetAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSite(value: SiteGenericIdentifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
