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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTypeResponse] (val x: Self) extends AnyVal {
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
