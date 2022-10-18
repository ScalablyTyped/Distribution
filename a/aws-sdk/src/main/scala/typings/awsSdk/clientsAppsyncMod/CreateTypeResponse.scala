package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTypeResponse extends StObject {
  
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object CreateTypeResponse {
  
  inline def apply(): CreateTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTypeResponse]
  }
  
  extension [Self <: CreateTypeResponse](x: Self) {
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
