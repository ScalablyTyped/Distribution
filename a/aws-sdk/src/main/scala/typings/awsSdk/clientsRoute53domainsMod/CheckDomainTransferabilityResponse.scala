package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDomainTransferabilityResponse extends StObject {
  
  /**
    * A complex type that contains information about whether the specified domain can be transferred to Route 53.
    */
  var Transferability: js.UndefOr[DomainTransferability] = js.undefined
}
object CheckDomainTransferabilityResponse {
  
  inline def apply(): CheckDomainTransferabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDomainTransferabilityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckDomainTransferabilityResponse] (val x: Self) extends AnyVal {
    
    inline def setTransferability(value: DomainTransferability): Self = StObject.set(x, "Transferability", value.asInstanceOf[js.Any])
    
    inline def setTransferabilityUndefined: Self = StObject.set(x, "Transferability", js.undefined)
  }
}
