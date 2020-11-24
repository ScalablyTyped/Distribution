package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceAdminResponse extends js.Object {
  
  /**
    * The name and ARN of the admin for the app instance.
    */
  var AppInstanceAdmin: js.UndefOr[Identity] = js.native
  
  /**
    * The ARN of the of the admin for the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
}
object CreateAppInstanceAdminResponse {
  
  @scala.inline
  def apply(): CreateAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceAdminResponse]
  }
  
  @scala.inline
  implicit class CreateAppInstanceAdminResponseOps[Self <: CreateAppInstanceAdminResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceAdmin(value: Identity): Self = this.set("AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceAdmin: Self = this.set("AppInstanceAdmin", js.undefined)
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceArn: Self = this.set("AppInstanceArn", js.undefined)
  }
}
