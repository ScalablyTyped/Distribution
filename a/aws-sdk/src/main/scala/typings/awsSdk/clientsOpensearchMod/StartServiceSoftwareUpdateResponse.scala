package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * The current status of the OpenSearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ServiceSoftwareOptions] = js.undefined
}
object StartServiceSoftwareUpdateResponse {
  
  inline def apply(): StartServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartServiceSoftwareUpdateResponse]
  }
  
  extension [Self <: StartServiceSoftwareUpdateResponse](x: Self) {
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
