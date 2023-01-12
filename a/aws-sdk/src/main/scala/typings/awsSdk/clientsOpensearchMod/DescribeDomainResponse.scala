package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResponse extends StObject {
  
  /**
    * List that contains the status of each specified OpenSearch Service domain.
    */
  var DomainStatus: typings.awsSdk.clientsOpensearchMod.DomainStatus
}
object DescribeDomainResponse {
  
  inline def apply(DomainStatus: DomainStatus): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}
