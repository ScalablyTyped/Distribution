package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorEntityResponse extends StObject {
  
  /**
    *  Describes the fields for that connector entity. For example, for an account entity, the fields would be account name, account ID, and so on. 
    */
  var connectorEntityFields: ConnectorEntityFieldList
}
object DescribeConnectorEntityResponse {
  
  inline def apply(connectorEntityFields: ConnectorEntityFieldList): DescribeConnectorEntityResponse = {
    val __obj = js.Dynamic.literal(connectorEntityFields = connectorEntityFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorEntityResponse]
  }
  
  extension [Self <: DescribeConnectorEntityResponse](x: Self) {
    
    inline def setConnectorEntityFields(value: ConnectorEntityFieldList): Self = StObject.set(x, "connectorEntityFields", value.asInstanceOf[js.Any])
    
    inline def setConnectorEntityFieldsVarargs(value: ConnectorEntityField*): Self = StObject.set(x, "connectorEntityFields", js.Array(value :_*))
  }
}
