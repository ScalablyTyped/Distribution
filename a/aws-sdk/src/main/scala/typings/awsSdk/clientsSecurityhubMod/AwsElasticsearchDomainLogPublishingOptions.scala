package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainLogPublishingOptions extends StObject {
  
  var AuditLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined
  
  /**
    * Configures the OpenSearch index logs publishing.
    */
  var IndexSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined
  
  /**
    * Configures the OpenSearch search slow log publishing.
    */
  var SearchSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined
}
object AwsElasticsearchDomainLogPublishingOptions {
  
  inline def apply(): AwsElasticsearchDomainLogPublishingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainLogPublishingOptions]
  }
  
  extension [Self <: AwsElasticsearchDomainLogPublishingOptions](x: Self) {
    
    inline def setAuditLogs(value: AwsElasticsearchDomainLogPublishingOptionsLogConfig): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogsUndefined: Self = StObject.set(x, "AuditLogs", js.undefined)
    
    inline def setIndexSlowLogs(value: AwsElasticsearchDomainLogPublishingOptionsLogConfig): Self = StObject.set(x, "IndexSlowLogs", value.asInstanceOf[js.Any])
    
    inline def setIndexSlowLogsUndefined: Self = StObject.set(x, "IndexSlowLogs", js.undefined)
    
    inline def setSearchSlowLogs(value: AwsElasticsearchDomainLogPublishingOptionsLogConfig): Self = StObject.set(x, "SearchSlowLogs", value.asInstanceOf[js.Any])
    
    inline def setSearchSlowLogsUndefined: Self = StObject.set(x, "SearchSlowLogs", js.undefined)
  }
}
