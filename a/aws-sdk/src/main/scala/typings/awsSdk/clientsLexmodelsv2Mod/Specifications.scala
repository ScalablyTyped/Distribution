package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Specifications extends StObject {
  
  /**
    * The unique identifier assigned to the slot type.
    */
  var slotTypeId: BuiltInOrCustomSlotTypeId
  
  /**
    * Specifies the elicitation setting details for constituent sub slots of a composite slot.
    */
  var valueElicitationSetting: SubSlotValueElicitationSetting
}
object Specifications {
  
  inline def apply(slotTypeId: BuiltInOrCustomSlotTypeId, valueElicitationSetting: SubSlotValueElicitationSetting): Specifications = {
    val __obj = js.Dynamic.literal(slotTypeId = slotTypeId.asInstanceOf[js.Any], valueElicitationSetting = valueElicitationSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specifications]
  }
  
  extension [Self <: Specifications](x: Self) {
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setValueElicitationSetting(value: SubSlotValueElicitationSetting): Self = StObject.set(x, "valueElicitationSetting", value.asInstanceOf[js.Any])
  }
}
