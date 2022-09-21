package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherName extends StObject {
  
  /**
    * Specifies an OID. 
    */
  var TypeId: CustomObjectIdentifier
  
  /**
    * Specifies an OID value.
    */
  var Value: String256
}
object OtherName {
  
  inline def apply(TypeId: CustomObjectIdentifier, Value: String256): OtherName = {
    val __obj = js.Dynamic.literal(TypeId = TypeId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherName]
  }
  
  extension [Self <: OtherName](x: Self) {
    
    inline def setTypeId(value: CustomObjectIdentifier): Self = StObject.set(x, "TypeId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String256): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
