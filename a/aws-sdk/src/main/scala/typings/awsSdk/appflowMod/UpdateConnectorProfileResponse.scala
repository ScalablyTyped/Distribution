package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectorProfileResponse extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.native
}
object UpdateConnectorProfileResponse {
  
  @scala.inline
  def apply(): UpdateConnectorProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectorProfileResponse]
  }
  
  @scala.inline
  implicit class UpdateConnectorProfileResponseOps[Self <: UpdateConnectorProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileArn(value: ConnectorProfileArn): Self = this.set("connectorProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileArn: Self = this.set("connectorProfileArn", js.undefined)
  }
}
