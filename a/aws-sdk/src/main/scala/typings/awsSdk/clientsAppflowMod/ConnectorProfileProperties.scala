package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorProfileProperties extends StObject {
  
  /**
    *  The connector-specific properties required by Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorProfileProperties] = js.undefined
  
  /**
    * The properties required by the custom connector.
    */
  var CustomConnector: js.UndefOr[CustomConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Datadog. 
    */
  var Datadog: js.UndefOr[DatadogConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Amazon Honeycode. 
    */
  var Honeycode: js.UndefOr[HoneycodeConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Marketo. 
    */
  var Marketo: js.UndefOr[MarketoConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftConnectorProfileProperties] = js.undefined
  
  var SAPOData: js.UndefOr[SAPODataConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by serviceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Singular. 
    */
  var Singular: js.UndefOr[SingularConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Slack. 
    */
  var Slack: js.UndefOr[SlackConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Veeva. 
    */
  var Veeva: js.UndefOr[VeevaConnectorProfileProperties] = js.undefined
  
  /**
    *  The connector-specific properties required by Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorProfileProperties] = js.undefined
}
object ConnectorProfileProperties {
  
  inline def apply(): ConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfileProperties]
  }
  
  extension [Self <: ConnectorProfileProperties](x: Self) {
    
    inline def setAmplitude(value: AmplitudeConnectorProfileProperties): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    inline def setCustomConnector(value: CustomConnectorProfileProperties): Self = StObject.set(x, "CustomConnector", value.asInstanceOf[js.Any])
    
    inline def setCustomConnectorUndefined: Self = StObject.set(x, "CustomConnector", js.undefined)
    
    inline def setDatadog(value: DatadogConnectorProfileProperties): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    inline def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    inline def setDynatrace(value: DynatraceConnectorProfileProperties): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    inline def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    inline def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileProperties): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    inline def setHoneycode(value: HoneycodeConnectorProfileProperties): Self = StObject.set(x, "Honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "Honeycode", js.undefined)
    
    inline def setInforNexus(value: InforNexusConnectorProfileProperties): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    inline def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    inline def setMarketo(value: MarketoConnectorProfileProperties): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setRedshift(value: RedshiftConnectorProfileProperties): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    inline def setSAPOData(value: SAPODataConnectorProfileProperties): Self = StObject.set(x, "SAPOData", value.asInstanceOf[js.Any])
    
    inline def setSAPODataUndefined: Self = StObject.set(x, "SAPOData", js.undefined)
    
    inline def setSalesforce(value: SalesforceConnectorProfileProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowConnectorProfileProperties): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setSingular(value: SingularConnectorProfileProperties): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    inline def setSlack(value: SlackConnectorProfileProperties): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    inline def setSnowflake(value: SnowflakeConnectorProfileProperties): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    inline def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    inline def setTrendmicro(value: TrendmicroConnectorProfileProperties): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    inline def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    inline def setVeeva(value: VeevaConnectorProfileProperties): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    inline def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    inline def setZendesk(value: ZendeskConnectorProfileProperties): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
