package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileProperties extends js.Object {
  
  /**
    *  The connector-specific properties required by Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Datadog. 
    */
  var Datadog: js.UndefOr[DatadogConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Marketo. 
    */
  var Marketo: js.UndefOr[MarketoConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by serviceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Singular. 
    */
  var Singular: js.UndefOr[SingularConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Slack. 
    */
  var Slack: js.UndefOr[SlackConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Veeva. 
    */
  var Veeva: js.UndefOr[VeevaConnectorProfileProperties] = js.native
  
  /**
    *  The connector-specific properties required by Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorProfileProperties] = js.native
}
object ConnectorProfileProperties {
  
  @scala.inline
  def apply(): ConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class ConnectorProfilePropertiesOps[Self <: ConnectorProfileProperties] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: AmplitudeConnectorProfileProperties): Self = this.set("Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorProfileProperties): Self = this.set("Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadog: Self = this.set("Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorProfileProperties): Self = this.set("Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynatrace: Self = this.set("Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileProperties): Self = this.set("GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorProfileProperties): Self = this.set("InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforNexus: Self = this.set("InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorProfileProperties): Self = this.set("Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketo: Self = this.set("Marketo", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftConnectorProfileProperties): Self = this.set("Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("Redshift", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorProfileProperties): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorProfileProperties): Self = this.set("ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNow: Self = this.set("ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorProfileProperties): Self = this.set("Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorProfileProperties): Self = this.set("Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlack: Self = this.set("Slack", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeConnectorProfileProperties): Self = this.set("Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowflake: Self = this.set("Snowflake", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorProfileProperties): Self = this.set("Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendmicro: Self = this.set("Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorProfileProperties): Self = this.set("Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVeeva: Self = this.set("Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorProfileProperties): Self = this.set("Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZendesk: Self = this.set("Zendesk", js.undefined)
  }
}
