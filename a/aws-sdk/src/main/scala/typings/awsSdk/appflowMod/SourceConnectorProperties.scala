package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceConnectorProperties extends js.Object {
  
  /**
    *  Specifies the information that is required for querying Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Datadog. 
    */
  var Datadog: js.UndefOr[DatadogSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Marketo. 
    */
  var Marketo: js.UndefOr[MarketoSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Amazon S3. 
    */
  var S3: js.UndefOr[S3SourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Singular. 
    */
  var Singular: js.UndefOr[SingularSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Slack. 
    */
  var Slack: js.UndefOr[SlackSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Veeva. 
    */
  var Veeva: js.UndefOr[VeevaSourceProperties] = js.native
  
  /**
    *  Specifies the information that is required for querying Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskSourceProperties] = js.native
}
object SourceConnectorProperties {
  
  @scala.inline
  def apply(): SourceConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConnectorProperties]
  }
  
  @scala.inline
  implicit class SourceConnectorPropertiesOps[Self <: SourceConnectorProperties] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: AmplitudeSourceProperties): Self = this.set("Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogSourceProperties): Self = this.set("Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadog: Self = this.set("Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceSourceProperties): Self = this.set("Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynatrace: Self = this.set("Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsSourceProperties): Self = this.set("GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusSourceProperties): Self = this.set("InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforNexus: Self = this.set("InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoSourceProperties): Self = this.set("Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketo: Self = this.set("Marketo", js.undefined)
    
    @scala.inline
    def setS3(value: S3SourceProperties): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceSourceProperties): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowSourceProperties): Self = this.set("ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNow: Self = this.set("ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularSourceProperties): Self = this.set("Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackSourceProperties): Self = this.set("Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlack: Self = this.set("Slack", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroSourceProperties): Self = this.set("Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendmicro: Self = this.set("Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaSourceProperties): Self = this.set("Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVeeva: Self = this.set("Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskSourceProperties): Self = this.set("Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZendesk: Self = this.set("Zendesk", js.undefined)
  }
}
