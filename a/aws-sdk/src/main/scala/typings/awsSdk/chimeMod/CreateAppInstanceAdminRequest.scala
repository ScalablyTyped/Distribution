package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceAdminRequest extends StObject {
  
  /**
    * The ARN of the administrator of the current app instance.
    */
  var AppInstanceAdminArn: ChimeArn = js.native
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
}
object CreateAppInstanceAdminRequest {
  
  @scala.inline
  def apply(AppInstanceAdminArn: ChimeArn, AppInstanceArn: ChimeArn): CreateAppInstanceAdminRequest = {
    val __obj = js.Dynamic.literal(AppInstanceAdminArn = AppInstanceAdminArn.asInstanceOf[js.Any], AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceAdminRequest]
  }
  
  @scala.inline
  implicit class CreateAppInstanceAdminRequestMutableBuilder[Self <: CreateAppInstanceAdminRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceAdminArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceAdminArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
