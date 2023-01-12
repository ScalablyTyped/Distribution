package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypeRequest extends StObject {
  
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName
  
  /**
    * The version of the slot type. 
    */
  var version: Version
}
object GetSlotTypeRequest {
  
  inline def apply(name: SlotTypeName, version: Version): GetSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSlotTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
