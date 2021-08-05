package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTypeResponse extends StObject {
  
  /**
    * The updated Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object UpdateTypeResponse {
  
  inline def apply(): UpdateTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTypeResponse]
  }
  
  extension [Self <: UpdateTypeResponse](x: Self) {
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
