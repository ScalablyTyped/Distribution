package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberReference extends StObject {
  
  /**
    * Identifier of the number reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * A valid number.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object NumberReference {
  
  inline def apply(): NumberReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
