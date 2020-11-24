package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorMetadata extends js.Object {
  
  /**
    *  The connector metadata specific to Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeMetadata] = js.native
  
  /**
    *  The connector metadata specific to Datadog. 
    */
  var Datadog: js.UndefOr[DatadogMetadata] = js.native
  
  /**
    *  The connector metadata specific to Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceMetadata] = js.native
  
  /**
    *  The connector metadata specific to Amazon EventBridge. 
    */
  var EventBridge: js.UndefOr[EventBridgeMetadata] = js.native
  
  /**
    *  The connector metadata specific to Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata] = js.native
  
  /**
    *  The connector metadata specific to Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusMetadata] = js.native
  
  /**
    *  The connector metadata specific to Marketo. 
    */
  var Marketo: js.UndefOr[MarketoMetadata] = js.native
  
  /**
    *  The connector metadata specific to Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftMetadata] = js.native
  
  /**
    *  The connector metadata specific to Amazon S3. 
    */
  var S3: js.UndefOr[S3Metadata] = js.native
  
  /**
    *  The connector metadata specific to Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceMetadata] = js.native
  
  /**
    *  The connector metadata specific to ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowMetadata] = js.native
  
  /**
    *  The connector metadata specific to Singular. 
    */
  var Singular: js.UndefOr[SingularMetadata] = js.native
  
  /**
    *  The connector metadata specific to Slack. 
    */
  var Slack: js.UndefOr[SlackMetadata] = js.native
  
  /**
    *  The connector metadata specific to Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeMetadata] = js.native
  
  /**
    *  The connector metadata specific to Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroMetadata] = js.native
  
  /**
    *  The connector metadata specific to Veeva. 
    */
  var Veeva: js.UndefOr[VeevaMetadata] = js.native
  
  /**
    *  The connector metadata specific to Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskMetadata] = js.native
}
object ConnectorMetadata {
  
  @scala.inline
  def apply(): ConnectorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorMetadata]
  }
  
  @scala.inline
  implicit class ConnectorMetadataOps[Self <: ConnectorMetadata] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: AmplitudeMetadata): Self = this.set("Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogMetadata): Self = this.set("Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadog: Self = this.set("Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceMetadata): Self = this.set("Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynatrace: Self = this.set("Dynatrace", js.undefined)
    
    @scala.inline
    def setEventBridge(value: EventBridgeMetadata): Self = this.set("EventBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBridge: Self = this.set("EventBridge", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsMetadata): Self = this.set("GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusMetadata): Self = this.set("InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforNexus: Self = this.set("InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoMetadata): Self = this.set("Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketo: Self = this.set("Marketo", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftMetadata): Self = this.set("Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("Redshift", js.undefined)
    
    @scala.inline
    def setS3(value: S3Metadata): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceMetadata): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowMetadata): Self = this.set("ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNow: Self = this.set("ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularMetadata): Self = this.set("Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackMetadata): Self = this.set("Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlack: Self = this.set("Slack", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeMetadata): Self = this.set("Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowflake: Self = this.set("Snowflake", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroMetadata): Self = this.set("Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendmicro: Self = this.set("Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaMetadata): Self = this.set("Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVeeva: Self = this.set("Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskMetadata): Self = this.set("Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZendesk: Self = this.set("Zendesk", js.undefined)
  }
}
