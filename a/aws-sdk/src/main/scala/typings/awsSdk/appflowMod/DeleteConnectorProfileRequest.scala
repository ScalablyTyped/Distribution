package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectorProfileRequest extends js.Object {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your account. 
    */
  var connectorProfileName: ConnectorProfileName = js.native
  
  /**
    *  Indicates whether Amazon AppFlow should delete the profile, even if it is currently in use in one or more flows. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.native
}
object DeleteConnectorProfileRequest {
  
  @scala.inline
  def apply(connectorProfileName: ConnectorProfileName): DeleteConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectorProfileName = connectorProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectorProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectorProfileRequestOps[Self <: DeleteConnectorProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDelete(value: Boolean): Self = this.set("forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("forceDelete", js.undefined)
  }
}
