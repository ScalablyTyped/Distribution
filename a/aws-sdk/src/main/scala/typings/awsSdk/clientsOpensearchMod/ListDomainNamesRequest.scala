package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainNamesRequest extends StObject {
  
  /**
    * Filters the output by domain engine type.
    */
  var EngineType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EngineType] = js.undefined
}
object ListDomainNamesRequest {
  
  inline def apply(): ListDomainNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesRequest]
  }
  
  extension [Self <: ListDomainNamesRequest](x: Self) {
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
  }
}
