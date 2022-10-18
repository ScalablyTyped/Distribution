package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringReference extends StObject {
  
  /**
    * Identifier of the string reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * A valid string.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object StringReference {
  
  inline def apply(): StringReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringReference]
  }
  
  extension [Self <: StringReference](x: Self) {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
