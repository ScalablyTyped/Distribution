package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceAdmin extends js.Object {
  
  /**
    * The name and metadata of the app instance administrator.
    */
  var Admin: js.UndefOr[Identity] = js.native
  
  /**
    * The ARN of the app instance administrator.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which an administrator was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
}
object AppInstanceAdmin {
  
  @scala.inline
  def apply(): AppInstanceAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceAdmin]
  }
  
  @scala.inline
  implicit class AppInstanceAdminOps[Self <: AppInstanceAdmin] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: Identity): Self = this.set("Admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin: Self = this.set("Admin", js.undefined)
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceArn: Self = this.set("AppInstanceArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
  }
}
