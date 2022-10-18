package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type to deprecate.
    */
  var thingTypeName: ThingTypeName
  
  /**
    * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
    */
  var undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined
}
object DeprecateThingTypeRequest {
  
  inline def apply(thingTypeName: ThingTypeName): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
  
  extension [Self <: DeprecateThingTypeRequest](x: Self) {
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setUndoDeprecate(value: UndoDeprecate): Self = StObject.set(x, "undoDeprecate", value.asInstanceOf[js.Any])
    
    inline def setUndoDeprecateUndefined: Self = StObject.set(x, "undoDeprecate", js.undefined)
  }
}
