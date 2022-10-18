package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2DHGroupNumbersListValue extends StObject {
  
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}
object Phase2DHGroupNumbersListValue {
  
  inline def apply(): Phase2DHGroupNumbersListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2DHGroupNumbersListValue]
  }
  
  extension [Self <: Phase2DHGroupNumbersListValue](x: Self) {
    
    inline def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
