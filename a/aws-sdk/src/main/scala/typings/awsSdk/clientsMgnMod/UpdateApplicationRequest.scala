package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * Application ID.
    */
  var applicationID: ApplicationID
  
  /**
    * Application description.
    */
  var description: js.UndefOr[ApplicationDescription] = js.undefined
  
  /**
    * Application name.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(applicationID: ApplicationID): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationID = applicationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ApplicationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
