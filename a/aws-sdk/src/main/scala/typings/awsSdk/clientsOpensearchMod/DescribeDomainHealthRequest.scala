package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainHealthRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object DescribeDomainHealthRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainHealthRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainHealthRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainHealthRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
