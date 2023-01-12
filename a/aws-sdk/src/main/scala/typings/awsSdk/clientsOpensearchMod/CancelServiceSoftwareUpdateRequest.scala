package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * Name of the OpenSearch Service domain that you want to cancel the service software update on.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object CancelServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): CancelServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
