package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The ID of the application that includes the environment you want to get.
    */
  var ApplicationId: Id
  
  /**
    * The ID of the environment you wnat to get.
    */
  var EnvironmentId: Id
}
object GetEnvironmentRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  @scala.inline
  implicit class GetEnvironmentRequestMutableBuilder[Self <: GetEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
  }
}
