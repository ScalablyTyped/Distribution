package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * Container for the state of your domain relative to the latest service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ServiceSoftwareOptions] = js.undefined
}
object CancelServiceSoftwareUpdateResponse {
  
  inline def apply(): CancelServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelServiceSoftwareUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelServiceSoftwareUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
