package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHITTypeResponse extends StObject {
  
  /**
    *  The ID of the newly registered HIT type.
    */
  var HITTypeId: js.UndefOr[EntityId] = js.undefined
}
object CreateHITTypeResponse {
  
  inline def apply(): CreateHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITTypeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHITTypeResponse] (val x: Self) extends AnyVal {
    
    inline def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    inline def setHITTypeIdUndefined: Self = StObject.set(x, "HITTypeId", js.undefined)
  }
}
