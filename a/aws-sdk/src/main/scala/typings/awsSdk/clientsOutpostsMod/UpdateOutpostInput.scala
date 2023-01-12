package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOutpostInput extends StObject {
  
  var Description: js.UndefOr[OutpostDescription] = js.undefined
  
  var Name: js.UndefOr[OutpostName] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostId: typings.awsSdk.clientsOutpostsMod.OutpostId
  
  /**
    *  The type of hardware for this Outpost. 
    */
  var SupportedHardwareType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.SupportedHardwareType] = js.undefined
}
object UpdateOutpostInput {
  
  inline def apply(OutpostId: OutpostId): UpdateOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOutpostInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOutpostInput] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareType(value: SupportedHardwareType): Self = StObject.set(x, "SupportedHardwareType", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareTypeUndefined: Self = StObject.set(x, "SupportedHardwareType", js.undefined)
  }
}
