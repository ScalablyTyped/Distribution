package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteElasticsearchDomainRequest extends StObject {
  
  /**
    * The name of the Elasticsearch domain that you want to permanently delete.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object DeleteElasticsearchDomainRequest {
  
  inline def apply(DomainName: DomainName): DeleteElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
  }
  
  extension [Self <: DeleteElasticsearchDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
