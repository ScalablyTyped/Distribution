package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the user request being deleted.
    */
  var AppInstanceUserArn: ChimeArn = js.native
}
object DeleteAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn): DeleteAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class DeleteAppInstanceUserRequestMutableBuilder[Self <: DeleteAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
  }
}
