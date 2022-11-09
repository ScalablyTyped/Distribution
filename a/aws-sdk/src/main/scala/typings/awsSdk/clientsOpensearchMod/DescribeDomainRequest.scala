package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainRequest extends StObject {
  
  /**
    * The name of the domain that you want information about.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object DescribeDomainRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainRequest]
  }
  
  extension [Self <: DescribeDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
