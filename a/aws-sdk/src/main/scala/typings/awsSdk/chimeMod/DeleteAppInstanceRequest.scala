package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppInstanceRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
}
object DeleteAppInstanceRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): DeleteAppInstanceRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceRequest]
  }
  
  @scala.inline
  implicit class DeleteAppInstanceRequestMutableBuilder[Self <: DeleteAppInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
