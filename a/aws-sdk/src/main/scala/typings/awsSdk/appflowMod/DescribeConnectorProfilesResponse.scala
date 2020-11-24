package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorProfilesResponse extends js.Object {
  
  /**
    *  Returns information about the connector profiles associated with the flow. 
    */
  var connectorProfileDetails: js.UndefOr[ConnectorProfileDetailList] = js.native
  
  /**
    *  The pagination token for the next page of data. If nextToken=null, this means that all records have been fetched. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorProfilesResponse {
  
  @scala.inline
  def apply(): DescribeConnectorProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorProfilesResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectorProfilesResponseOps[Self <: DescribeConnectorProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileDetailsVarargs(value: ConnectorProfile*): Self = this.set("connectorProfileDetails", js.Array(value :_*))
    
    @scala.inline
    def setConnectorProfileDetails(value: ConnectorProfileDetailList): Self = this.set("connectorProfileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileDetails: Self = this.set("connectorProfileDetails", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
