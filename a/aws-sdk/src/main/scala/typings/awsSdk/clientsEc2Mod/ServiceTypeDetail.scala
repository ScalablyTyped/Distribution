package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceTypeDetail extends StObject {
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ServiceType] = js.undefined
}
object ServiceTypeDetail {
  
  inline def apply(): ServiceTypeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceTypeDetail]
  }
  
  extension [Self <: ServiceTypeDetail](x: Self) {
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
