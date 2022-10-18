package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceOutput extends StObject {
  
  /**
    * The detailed data of the requested service.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object GetServiceOutput {
  
  inline def apply(): GetServiceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceOutput]
  }
  
  extension [Self <: GetServiceOutput](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
