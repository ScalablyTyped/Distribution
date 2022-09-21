package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConnectorProperties extends StObject {
  
  /**
    * The properties that are required to query the custom Connector.
    */
  var CustomConnector: js.UndefOr[CustomConnectorDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon Connect Customer Profiles. 
    */
  var CustomerProfiles: js.UndefOr[CustomerProfilesDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon EventBridge. 
    */
  var EventBridge: js.UndefOr[EventBridgeDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon Honeycode. 
    */
  var Honeycode: js.UndefOr[HoneycodeDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon Lookout for Metrics. 
    */
  var LookoutMetrics: js.UndefOr[LookoutMetricsDestinationProperties] = js.undefined
  
  /**
    * The properties required to query Marketo.
    */
  var Marketo: js.UndefOr[MarketoDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon S3. 
    */
  var S3: js.UndefOr[S3DestinationProperties] = js.undefined
  
  /**
    * The properties required to query SAPOData.
    */
  var SAPOData: js.UndefOr[SAPODataDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Upsolver. 
    */
  var Upsolver: js.UndefOr[UpsolverDestinationProperties] = js.undefined
  
  /**
    * The properties required to query Zendesk.
    */
  var Zendesk: js.UndefOr[ZendeskDestinationProperties] = js.undefined
}
object DestinationConnectorProperties {
  
  inline def apply(): DestinationConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConnectorProperties]
  }
  
  extension [Self <: DestinationConnectorProperties](x: Self) {
    
    inline def setCustomConnector(value: CustomConnectorDestinationProperties): Self = StObject.set(x, "CustomConnector", value.asInstanceOf[js.Any])
    
    inline def setCustomConnectorUndefined: Self = StObject.set(x, "CustomConnector", js.undefined)
    
    inline def setCustomerProfiles(value: CustomerProfilesDestinationProperties): Self = StObject.set(x, "CustomerProfiles", value.asInstanceOf[js.Any])
    
    inline def setCustomerProfilesUndefined: Self = StObject.set(x, "CustomerProfiles", js.undefined)
    
    inline def setEventBridge(value: EventBridgeDestinationProperties): Self = StObject.set(x, "EventBridge", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeUndefined: Self = StObject.set(x, "EventBridge", js.undefined)
    
    inline def setHoneycode(value: HoneycodeDestinationProperties): Self = StObject.set(x, "Honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "Honeycode", js.undefined)
    
    inline def setLookoutMetrics(value: LookoutMetricsDestinationProperties): Self = StObject.set(x, "LookoutMetrics", value.asInstanceOf[js.Any])
    
    inline def setLookoutMetricsUndefined: Self = StObject.set(x, "LookoutMetrics", js.undefined)
    
    inline def setMarketo(value: MarketoDestinationProperties): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setRedshift(value: RedshiftDestinationProperties): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    inline def setS3(value: S3DestinationProperties): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSAPOData(value: SAPODataDestinationProperties): Self = StObject.set(x, "SAPOData", value.asInstanceOf[js.Any])
    
    inline def setSAPODataUndefined: Self = StObject.set(x, "SAPOData", js.undefined)
    
    inline def setSalesforce(value: SalesforceDestinationProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setSnowflake(value: SnowflakeDestinationProperties): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    inline def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    inline def setUpsolver(value: UpsolverDestinationProperties): Self = StObject.set(x, "Upsolver", value.asInstanceOf[js.Any])
    
    inline def setUpsolverUndefined: Self = StObject.set(x, "Upsolver", js.undefined)
    
    inline def setZendesk(value: ZendeskDestinationProperties): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
