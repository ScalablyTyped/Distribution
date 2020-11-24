package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileCredentials extends js.Object {
  
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
  implicit class ConnectorProfileCredentialsOps[Self <: ConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: AmplitudeConnectorProfileCredentials): Self = this.set("Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorProfileCredentials): Self = this.set("Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadog: Self = this.set("Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorProfileCredentials): Self = this.set("Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynatrace: Self = this.set("Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileCredentials): Self = this.set("GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorProfileCredentials): Self = this.set("InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforNexus: Self = this.set("InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorProfileCredentials): Self = this.set("Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketo: Self = this.set("Marketo", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftConnectorProfileCredentials): Self = this.set("Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("Redshift", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorProfileCredentials): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorProfileCredentials): Self = this.set("ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNow: Self = this.set("ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorProfileCredentials): Self = this.set("Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorProfileCredentials): Self = this.set("Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlack: Self = this.set("Slack", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeConnectorProfileCredentials): Self = this.set("Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowflake: Self = this.set("Snowflake", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorProfileCredentials): Self = this.set("Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendmicro: Self = this.set("Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorProfileCredentials): Self = this.set("Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVeeva: Self = this.set("Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorProfileCredentials): Self = this.set("Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZendesk: Self = this.set("Zendesk", js.undefined)
  }
}
