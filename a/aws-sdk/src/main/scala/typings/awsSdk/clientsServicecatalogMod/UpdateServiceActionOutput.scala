package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceActionOutput extends StObject {
  
  /**
    * Detailed information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ServiceActionDetail] = js.undefined
}
object UpdateServiceActionOutput {
  
  inline def apply(): UpdateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceActionOutput]
  }
  
  extension [Self <: UpdateServiceActionOutput](x: Self) {
    
    inline def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    inline def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
