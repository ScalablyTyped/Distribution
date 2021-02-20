package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorEntityResponse extends StObject {
  
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
  implicit class DescribeConnectorEntityResponseMutableBuilder[Self <: DescribeConnectorEntityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorEntityFields(value: ConnectorEntityFieldList): Self = StObject.set(x, "connectorEntityFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorEntityFieldsVarargs(value: ConnectorEntityField*): Self = StObject.set(x, "connectorEntityFields", js.Array(value :_*))
  }
}
