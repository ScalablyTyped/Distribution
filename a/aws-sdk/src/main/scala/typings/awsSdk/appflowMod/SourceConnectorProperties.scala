package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConnectorProperties extends StObject {
  
  /**
    *  Specifies the information that is required for querying Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Datadog. 
    */
  var Datadog: js.UndefOr[DatadogSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Marketo. 
    */
  var Marketo: js.UndefOr[MarketoSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Amazon S3. 
    */
  var S3: js.UndefOr[S3SourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Singular. 
    */
  var Singular: js.UndefOr[SingularSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Slack. 
    */
  var Slack: js.UndefOr[SlackSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Veeva. 
    */
  var Veeva: js.UndefOr[VeevaSourceProperties] = js.undefined
  
  /**
    *  Specifies the information that is required for querying Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskSourceProperties] = js.undefined
}
object SourceConnectorProperties {
  
  @scala.inline
  def apply(): SourceConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConnectorProperties]
  }
  
  @scala.inline
  implicit class SourceConnectorPropertiesMutableBuilder[Self <: SourceConnectorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmplitude(value: AmplitudeSourceProperties): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogSourceProperties): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceSourceProperties): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsSourceProperties): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusSourceProperties): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoSourceProperties): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    @scala.inline
    def setS3(value: S3SourceProperties): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceSourceProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowSourceProperties): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularSourceProperties): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackSourceProperties): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroSourceProperties): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaSourceProperties): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskSourceProperties): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
