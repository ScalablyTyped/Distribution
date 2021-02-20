package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationRequest extends StObject {
  
  /**
    * The ID of the application to delete.
    */
  var ApplicationId: Id = js.native
}
object DeleteApplicationRequest {
  
  @scala.inline
  def apply(ApplicationId: Id): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationRequestMutableBuilder[Self <: DeleteApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
