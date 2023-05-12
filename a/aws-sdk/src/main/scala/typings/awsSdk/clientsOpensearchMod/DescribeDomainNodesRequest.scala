package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainNodesRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object DescribeDomainNodesRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainNodesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainNodesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainNodesRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
