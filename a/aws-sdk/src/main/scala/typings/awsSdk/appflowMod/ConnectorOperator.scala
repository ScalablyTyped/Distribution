package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorOperator extends js.Object {
  
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
  implicit class ConnectorOperatorOps[Self <: ConnectorOperator] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: AmplitudeConnectorOperator): Self = this.set("Amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("Amplitude", js.undefined)
    
    @scala.inline
    def setDatadog(value: DatadogConnectorOperator): Self = this.set("Datadog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatadog: Self = this.set("Datadog", js.undefined)
    
    @scala.inline
    def setDynatrace(value: DynatraceConnectorOperator): Self = this.set("Dynatrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynatrace: Self = this.set("Dynatrace", js.undefined)
    
    @scala.inline
    def setGoogleAnalytics(value: GoogleAnalyticsConnectorOperator): Self = this.set("GoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAnalytics: Self = this.set("GoogleAnalytics", js.undefined)
    
    @scala.inline
    def setInforNexus(value: InforNexusConnectorOperator): Self = this.set("InforNexus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInforNexus: Self = this.set("InforNexus", js.undefined)
    
    @scala.inline
    def setMarketo(value: MarketoConnectorOperator): Self = this.set("Marketo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketo: Self = this.set("Marketo", js.undefined)
    
    @scala.inline
    def setS3(value: S3ConnectorOperator): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceConnectorOperator): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setServiceNow(value: ServiceNowConnectorOperator): Self = this.set("ServiceNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNow: Self = this.set("ServiceNow", js.undefined)
    
    @scala.inline
    def setSingular(value: SingularConnectorOperator): Self = this.set("Singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("Singular", js.undefined)
    
    @scala.inline
    def setSlack(value: SlackConnectorOperator): Self = this.set("Slack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlack: Self = this.set("Slack", js.undefined)
    
    @scala.inline
    def setTrendmicro(value: TrendmicroConnectorOperator): Self = this.set("Trendmicro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendmicro: Self = this.set("Trendmicro", js.undefined)
    
    @scala.inline
    def setVeeva(value: VeevaConnectorOperator): Self = this.set("Veeva", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVeeva: Self = this.set("Veeva", js.undefined)
    
    @scala.inline
    def setZendesk(value: ZendeskConnectorOperator): Self = this.set("Zendesk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZendesk: Self = this.set("Zendesk", js.undefined)
  }
}
