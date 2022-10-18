package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCondition extends StObject {
  
  /**
    *  A statement containing a resource property and a value to specify filter condition. 
    */
  var value: js.UndefOr[filterString] = js.undefined
}
object FilterCondition {
  
  inline def apply(): FilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCondition]
  }
  
  extension [Self <: FilterCondition](x: Self) {
    
    inline def setValue(value: filterString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
