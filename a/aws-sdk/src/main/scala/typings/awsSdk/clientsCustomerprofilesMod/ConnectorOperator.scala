package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorOperator extends StObject {
  
  /**
    * The operation to be performed on the provided Marketo source fields.
    */
  var Marketo: js.UndefOr[MarketoConnectorOperator] = js.undefined
  
  /**
    * The operation to be performed on the provided Amazon S3 source fields.
    */
  var S3: js.UndefOr[S3ConnectorOperator] = js.undefined
  
  /**
    * The operation to be performed on the provided Salesforce source fields.
    */
  var Salesforce: js.UndefOr[SalesforceConnectorOperator] = js.undefined
  
  /**
    * The operation to be performed on the provided ServiceNow source fields.
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorOperator] = js.undefined
  
  /**
    * The operation to be performed on the provided Zendesk source fields.
    */
  var Zendesk: js.UndefOr[ZendeskConnectorOperator] = js.undefined
}
object ConnectorOperator {
  
  inline def apply(): ConnectorOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOperator]
  }
  
  extension [Self <: ConnectorOperator](x: Self) {
    
    inline def setMarketo(value: MarketoConnectorOperator): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setS3(value: S3ConnectorOperator): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSalesforce(value: SalesforceConnectorOperator): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowConnectorOperator): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setZendesk(value: ZendeskConnectorOperator): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
