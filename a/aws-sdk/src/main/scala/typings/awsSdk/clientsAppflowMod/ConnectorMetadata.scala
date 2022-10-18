package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorMetadata extends StObject {
  
  /**
    *  The connector metadata specific to Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Amazon Connect Customer Profiles. 
    */
  var CustomerProfiles: js.UndefOr[CustomerProfilesMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Datadog. 
    */
  var Datadog: js.UndefOr[DatadogMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Amazon EventBridge. 
    */
  var EventBridge: js.UndefOr[EventBridgeMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Amazon Honeycode. 
    */
  var Honeycode: js.UndefOr[HoneycodeMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Marketo. 
    */
  var Marketo: js.UndefOr[MarketoMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Amazon S3. 
    */
  var S3: js.UndefOr[S3Metadata] = js.undefined
  
  var SAPOData: js.UndefOr[SAPODataMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Singular. 
    */
  var Singular: js.UndefOr[SingularMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Slack. 
    */
  var Slack: js.UndefOr[SlackMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Upsolver. 
    */
  var Upsolver: js.UndefOr[UpsolverMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Veeva. 
    */
  var Veeva: js.UndefOr[VeevaMetadata] = js.undefined
  
  /**
    *  The connector metadata specific to Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskMetadata] = js.undefined
}
object ConnectorMetadata {
  
  inline def apply(): ConnectorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorMetadata]
  }
  
  extension [Self <: ConnectorMetadata](x: Self) {
    
    inline def setAmplitude(value: AmplitudeMetadata): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    inline def setCustomerProfiles(value: CustomerProfilesMetadata): Self = StObject.set(x, "CustomerProfiles", value.asInstanceOf[js.Any])
    
    inline def setCustomerProfilesUndefined: Self = StObject.set(x, "CustomerProfiles", js.undefined)
    
    inline def setDatadog(value: DatadogMetadata): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    inline def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    inline def setDynatrace(value: DynatraceMetadata): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    inline def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    inline def setEventBridge(value: EventBridgeMetadata): Self = StObject.set(x, "EventBridge", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeUndefined: Self = StObject.set(x, "EventBridge", js.undefined)
    
    inline def setGoogleAnalytics(value: GoogleAnalyticsMetadata): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    inline def setHoneycode(value: HoneycodeMetadata): Self = StObject.set(x, "Honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "Honeycode", js.undefined)
    
    inline def setInforNexus(value: InforNexusMetadata): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    inline def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    inline def setMarketo(value: MarketoMetadata): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setRedshift(value: RedshiftMetadata): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    inline def setS3(value: S3Metadata): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSAPOData(value: SAPODataMetadata): Self = StObject.set(x, "SAPOData", value.asInstanceOf[js.Any])
    
    inline def setSAPODataUndefined: Self = StObject.set(x, "SAPOData", js.undefined)
    
    inline def setSalesforce(value: SalesforceMetadata): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowMetadata): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setSingular(value: SingularMetadata): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    inline def setSlack(value: SlackMetadata): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    inline def setSnowflake(value: SnowflakeMetadata): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    inline def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    inline def setTrendmicro(value: TrendmicroMetadata): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    inline def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    inline def setUpsolver(value: UpsolverMetadata): Self = StObject.set(x, "Upsolver", value.asInstanceOf[js.Any])
    
    inline def setUpsolverUndefined: Self = StObject.set(x, "Upsolver", js.undefined)
    
    inline def setVeeva(value: VeevaMetadata): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    inline def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    inline def setZendesk(value: ZendeskMetadata): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
