package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteElasticsearchDomainResponse extends StObject {
  
  /**
    * The status of the Elasticsearch domain being deleted.
    */
  var DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
}
object DeleteElasticsearchDomainResponse {
  
  inline def apply(): DeleteElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
  }
  
  extension [Self <: DeleteElasticsearchDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: ElasticsearchDomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
