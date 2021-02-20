package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileCredentials extends StObject {
  
  /**
    *  The connector-specific credentials required when using Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Datadog. 
    */
  var Datadog: js.UndefOr[DatadogConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Marketo. 
    */
  var Marketo: js.UndefOr[MarketoConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Singular. 
    */
  var Singular: js.UndefOr[SingularConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Slack. 
    */
  var Slack: js.UndefOr[SlackConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Veeva. 
    */
  var Veeva: js.UndefOr[VeevaConnectorProfileCredentials] = js.native
  
  /**
    *  The connector-specific credentials required when using Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorProfileCredentials] = js.native
}
object ConnectorProfileCredentials {
  
  @scala.inline
  def apply(): ConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class ConnectorProfileCredentialsMutableBuilder[Self <: ConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmplitude(value: AmplitudeConnectorProfileCredentials): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorProfileCredentials): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorProfileCredentials): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileCredentials): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorProfileCredentials): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorProfileCredentials): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftConnectorProfileCredentials): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorProfileCredentials): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorProfileCredentials): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorProfileCredentials): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorProfileCredentials): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeConnectorProfileCredentials): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorProfileCredentials): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorProfileCredentials): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorProfileCredentials): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
