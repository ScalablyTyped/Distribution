package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The application ID that includes the environment you want to delete.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the environment you want to delete.
    */
  var EnvironmentId: Id
}
object DeleteEnvironmentRequest {
  
  inline def apply(ApplicationId: Id, EnvironmentId: Id): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  extension [Self <: DeleteEnvironmentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
