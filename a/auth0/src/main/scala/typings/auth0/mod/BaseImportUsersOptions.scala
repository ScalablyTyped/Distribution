package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseImportUsersOptions extends js.Object {
  
  var connection_id: String = js.native
  
  var external_id: js.UndefOr[String] = js.native
  
  var send_completion_email: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object BaseImportUsersOptions {
  
  @scala.inline
  def apply(connection_id: String): BaseImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImportUsersOptions]
  }
  
  @scala.inline
  implicit class BaseImportUsersOptionsOps[Self <: BaseImportUsersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setSend_completion_email(value: Boolean): Self = this.set("send_completion_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend_completion_email: Self = this.set("send_completion_email", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
}
