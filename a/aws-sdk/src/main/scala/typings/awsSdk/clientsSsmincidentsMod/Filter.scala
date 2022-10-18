package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The condition accepts before or after a specified time, equal to a string, or equal to an integer.
    */
  var condition: Condition
  
  /**
    * The key that you're filtering on.
    */
  var key: FilterKeyString
}
object Filter {
  
  inline def apply(condition: Condition, key: FilterKeyString): Filter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setKey(value: FilterKeyString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
