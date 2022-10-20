package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference extends StObject {
  
  /**
    * The type of the reference. DATE must be of type Epoch timestamp. 
    */
  var Type: ReferenceType
  
  /**
    * A valid value for the reference. For example, for a URL reference, a formatted URL that is displayed to an agent in the Contact Control Panel (CCP).
    */
  var Value: ReferenceValue
}
object Reference {
  
  inline def apply(Type: ReferenceType, Value: ReferenceValue): Reference = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setType(value: ReferenceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
