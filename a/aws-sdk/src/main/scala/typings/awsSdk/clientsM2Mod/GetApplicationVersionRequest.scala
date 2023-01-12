package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationVersionRequest extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The specific version of the application.
    */
  var applicationVersion: Version
}
object GetApplicationVersionRequest {
  
  inline def apply(applicationId: Identifier, applicationVersion: Version): GetApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
  }
}
