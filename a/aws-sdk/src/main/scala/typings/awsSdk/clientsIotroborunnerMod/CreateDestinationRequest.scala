package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDestinationRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
  
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  var name: Name
  
  var site: SiteGenericIdentifier
  
  /**
    * The state of the destination. Default used if not specified.
    */
  var state: js.UndefOr[DestinationState] = js.undefined
}
object CreateDestinationRequest {
  
  inline def apply(name: Name, site: SiteGenericIdentifier): CreateDestinationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: DestinationAdditionalFixedProperties): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSite(value: SiteGenericIdentifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setState(value: DestinationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
