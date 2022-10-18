package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainResponse extends StObject {
  
  /**
    * The current status of the Elasticsearch domain.
    */
  var DomainStatus: ElasticsearchDomainStatus
}
object DescribeElasticsearchDomainResponse {
  
  inline def apply(DomainStatus: ElasticsearchDomainStatus): DescribeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
  }
  
  extension [Self <: DescribeElasticsearchDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: ElasticsearchDomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}
