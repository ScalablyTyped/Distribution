package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorsRequest extends js.Object {
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorTypes: js.UndefOr[ConnectorTypeList] = js.native
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorsRequest {
  
  @scala.inline
  def apply(): DescribeConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorsRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorsRequestOps[Self <: DescribeConnectorsRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorTypesVarargs(value: ConnectorType*): Self = this.set("connectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setConnectorTypes(value: ConnectorTypeList): Self = this.set("connectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorTypes: Self = this.set("connectorTypes", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
