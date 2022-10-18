package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppflowIntegrationWorkflowAttributes extends StObject {
  
  /**
    * The name of the AppFlow connector profile used for ingestion.
    */
  var ConnectorProfileName: typings.awsSdk.clientsCustomerprofilesMod.ConnectorProfileName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your behalf as part of workflow execution.
    */
  var RoleArn: js.UndefOr[string1To255] = js.undefined
  
  /**
    * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
    */
  var SourceConnectorType: typings.awsSdk.clientsCustomerprofilesMod.SourceConnectorType
}
object AppflowIntegrationWorkflowAttributes {
  
  inline def apply(ConnectorProfileName: ConnectorProfileName, SourceConnectorType: SourceConnectorType): AppflowIntegrationWorkflowAttributes = {
    val __obj = js.Dynamic.literal(ConnectorProfileName = ConnectorProfileName.asInstanceOf[js.Any], SourceConnectorType = SourceConnectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppflowIntegrationWorkflowAttributes]
  }
  
  extension [Self <: AppflowIntegrationWorkflowAttributes](x: Self) {
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "ConnectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: string1To255): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSourceConnectorType(value: SourceConnectorType): Self = StObject.set(x, "SourceConnectorType", value.asInstanceOf[js.Any])
  }
}
