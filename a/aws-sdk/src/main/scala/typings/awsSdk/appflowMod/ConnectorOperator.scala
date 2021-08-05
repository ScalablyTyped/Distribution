package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorOperator extends StObject {
  
  /**
    *  The operation to be performed on the provided Amplitude source fields. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Datadog source fields. 
    */
  var Datadog: js.UndefOr[DatadogConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Dynatrace source fields. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Google Analytics source fields. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Infor Nexus source fields. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Marketo source fields. 
    */
  var Marketo: js.UndefOr[MarketoConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Amazon S3 source fields. 
    */
  var S3: js.UndefOr[S3ConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Salesforce source fields. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided ServiceNow source fields. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Singular source fields. 
    */
  var Singular: js.UndefOr[SingularConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Slack source fields. 
    */
  var Slack: js.UndefOr[SlackConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Trend Micro source fields. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Veeva source fields. 
    */
  var Veeva: js.UndefOr[VeevaConnectorOperator] = js.undefined
  
  /**
    *  The operation to be performed on the provided Zendesk source fields. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorOperator] = js.undefined
}
object ConnectorOperator {
  
  inline def apply(): ConnectorOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOperator]
  }
  
  extension [Self <: ConnectorOperator](x: Self) {
    
    inline def setAmplitude(value: AmplitudeConnectorOperator): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    inline def setDatadog(value: DatadogConnectorOperator): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    inline def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    inline def setDynatrace(value: DynatraceConnectorOperator): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    inline def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    inline def setGoogleAnalytics(value: GoogleAnalyticsConnectorOperator): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    inline def setInforNexus(value: InforNexusConnectorOperator): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    inline def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    inline def setMarketo(value: MarketoConnectorOperator): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setS3(value: S3ConnectorOperator): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSalesforce(value: SalesforceConnectorOperator): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowConnectorOperator): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setSingular(value: SingularConnectorOperator): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    inline def setSlack(value: SlackConnectorOperator): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    inline def setTrendmicro(value: TrendmicroConnectorOperator): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    inline def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    inline def setVeeva(value: VeevaConnectorOperator): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    inline def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    inline def setZendesk(value: ZendeskConnectorOperator): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
