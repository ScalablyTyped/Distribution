package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorProfilesRequest extends js.Object {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
    */
  var connectorProfileNames: js.UndefOr[ConnectorProfileNameList] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.native
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. The default for maxResults is 20 (for all paginated API operations). 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorProfilesRequest {
  
  @scala.inline
  def apply(): DescribeConnectorProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorProfilesRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorProfilesRequestOps[Self <: DescribeConnectorProfilesRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileNamesVarargs(value: ConnectorProfileName*): Self = this.set("connectorProfileNames", js.Array(value :_*))
    
    @scala.inline
    def setConnectorProfileNames(value: ConnectorProfileNameList): Self = this.set("connectorProfileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileNames: Self = this.set("connectorProfileNames", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
