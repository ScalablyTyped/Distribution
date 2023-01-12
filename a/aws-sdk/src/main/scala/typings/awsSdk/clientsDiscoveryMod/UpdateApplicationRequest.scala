package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * Configuration ID of the application to be updated.
    */
  var configurationId: ApplicationId
  
  /**
    * New description of the application to be updated.
    */
  var description: js.UndefOr[ApplicationDescription] = js.undefined
  
  /**
    * New name of the application to be updated.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(configurationId: ApplicationId): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationId(value: ApplicationId): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ApplicationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
