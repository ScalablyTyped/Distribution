package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeBooleanValue extends StObject {
  
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object AttributeBooleanValue {
  
  inline def apply(): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeBooleanValue]
  }
  
  extension [Self <: AttributeBooleanValue](x: Self) {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
