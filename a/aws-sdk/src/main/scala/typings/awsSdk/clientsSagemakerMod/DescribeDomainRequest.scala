package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
}
object DescribeDomainRequest {
  
  inline def apply(DomainId: DomainId): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainRequest]
  }
  
  extension [Self <: DescribeDomainRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
  }
}
