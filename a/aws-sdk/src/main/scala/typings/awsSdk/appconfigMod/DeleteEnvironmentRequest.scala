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
  
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  @scala.inline
  implicit class DeleteEnvironmentRequestMutableBuilder[Self <: DeleteEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
