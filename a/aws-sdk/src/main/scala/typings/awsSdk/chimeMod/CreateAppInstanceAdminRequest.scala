package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceAdminRequest extends js.Object {
  
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
  implicit class CreateAppInstanceAdminRequestOps[Self <: CreateAppInstanceAdminRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppInstanceAdminArn(value: ChimeArn): Self = this.set("AppInstanceAdminArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
