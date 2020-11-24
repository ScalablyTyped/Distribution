package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorEntityResponse extends js.Object {
  
  /**
    *  Describes the fields for that connector entity. For example, for an account entity, the fields would be account name, account ID, and so on. 
    */
  var connectorEntityFields: ConnectorEntityFieldList = js.native
}
object DescribeConnectorEntityResponse {
  
  @scala.inline
  def apply(connectorEntityFields: ConnectorEntityFieldList): DescribeConnectorEntityResponse = {
    val __obj = js.Dynamic.literal(connectorEntityFields = connectorEntityFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorEntityResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectorEntityResponseOps[Self <: DescribeConnectorEntityResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectorEntityFieldsVarargs(value: ConnectorEntityField*): Self = this.set("connectorEntityFields", js.Array(value :_*))
    
    @scala.inline
    def setConnectorEntityFields(value: ConnectorEntityFieldList): Self = this.set("connectorEntityFields", value.asInstanceOf[js.Any])
  }
}
