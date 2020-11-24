package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorsResponse extends js.Object {
  
  /**
    *  The configuration that is applied to the connectors used in the flow. 
    */
  var connectorConfigurations: js.UndefOr[ConnectorConfigurationsMap] = js.native
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorsResponse {
  
  @scala.inline
  def apply(): DescribeConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorsResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectorsResponseOps[Self <: DescribeConnectorsResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectorConfigurations(value: ConnectorConfigurationsMap): Self = this.set("connectorConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorConfigurations: Self = this.set("connectorConfigurations", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
