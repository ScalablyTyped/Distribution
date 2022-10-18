package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOutputPort extends StObject {
  
  /**
    * The output port's description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * The output port's name.
    */
  var Name: js.UndefOr[PortName] = js.undefined
  
  /**
    * The output port's type.
    */
  var Type: js.UndefOr[PortType] = js.undefined
}
object NodeOutputPort {
  
  inline def apply(): NodeOutputPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOutputPort]
  }
  
  extension [Self <: NodeOutputPort](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: PortName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: PortType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
