package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpoint extends StObject {
  
  var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
}
object ServiceEndpoint {
  
  inline def apply(): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceEndpoint]
  }
  
  extension [Self <: ServiceEndpoint](x: Self) {
    
    inline def setEndpoint(value: ServiceUrl): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
