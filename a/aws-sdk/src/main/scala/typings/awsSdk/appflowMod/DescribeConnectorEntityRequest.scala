package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorEntityRequest extends js.Object {
  
  /**
    *  The entity name for that connector. 
    */
  var connectorEntityName: Name = js.native
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector application, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.native
}
object DescribeConnectorEntityRequest {
  
  @scala.inline
  def apply(connectorEntityName: Name): DescribeConnectorEntityRequest = {
    val __obj = js.Dynamic.literal(connectorEntityName = connectorEntityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorEntityRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorEntityRequestOps[Self <: DescribeConnectorEntityRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorEntityName(value: Name): Self = this.set("connectorEntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileName: Self = this.set("connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
  }
}
