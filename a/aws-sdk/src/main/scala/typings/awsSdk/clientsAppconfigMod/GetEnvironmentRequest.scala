package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The ID of the application that includes the environment you want to get.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the environment that you want to get.
    */
  var EnvironmentId: Id
}
object GetEnvironmentRequest {
  
  inline def apply(ApplicationId: Id, EnvironmentId: Id): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
