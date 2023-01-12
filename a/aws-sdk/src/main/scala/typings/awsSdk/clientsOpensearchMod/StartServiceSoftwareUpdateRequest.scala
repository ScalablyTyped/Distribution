package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to update to the latest service software.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
}
object StartServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): StartServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
