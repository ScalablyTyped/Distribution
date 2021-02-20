package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorOperator extends StObject {
  
  /**
    *  The operation to be performed on the provided Amplitude source fields. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Datadog source fields. 
    */
  var Datadog: js.UndefOr[DatadogConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Dynatrace source fields. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Google Analytics source fields. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Infor Nexus source fields. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Marketo source fields. 
    */
  var Marketo: js.UndefOr[MarketoConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Amazon S3 source fields. 
    */
  var S3: js.UndefOr[S3ConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Salesforce source fields. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided ServiceNow source fields. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Singular source fields. 
    */
  var Singular: js.UndefOr[SingularConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Slack source fields. 
    */
  var Slack: js.UndefOr[SlackConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Trend Micro source fields. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Veeva source fields. 
    */
  var Veeva: js.UndefOr[VeevaConnectorOperator] = js.native
  
  /**
    *  The operation to be performed on the provided Zendesk source fields. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorOperator] = js.native
}
object ConnectorOperator {
  
  @scala.inline
  def apply(): ConnectorOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOperator]
  }
  
  @scala.inline
  implicit class ConnectorOperatorMutableBuilder[Self <: ConnectorOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmplitude(value: AmplitudeConnectorOperator): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorOperator): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorOperator): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorOperator): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorOperator): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorOperator): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    @scala.inline
    def setS3(value: S3ConnectorOperator): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorOperator): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorOperator): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorOperator): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorOperator): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorOperator): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorOperator): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorOperator): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
