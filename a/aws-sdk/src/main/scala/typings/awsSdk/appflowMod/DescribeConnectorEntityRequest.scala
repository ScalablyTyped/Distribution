package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorEntityRequest extends StObject {
  
  /**
    *  The entity name for that connector. 
    */
  var connectorEntityName: Name
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The type of connector application, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
}
object DescribeConnectorEntityRequest {
  
  @scala.inline
  def apply(connectorEntityName: Name): DescribeConnectorEntityRequest = {
    val __obj = js.Dynamic.literal(connectorEntityName = connectorEntityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorEntityRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectorEntityRequestMutableBuilder[Self <: DescribeConnectorEntityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorEntityName(value: Name): Self = StObject.set(x, "connectorEntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
  }
}
