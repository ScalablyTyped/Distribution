package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerRange extends StObject {
  
  /**
    * A maximum value.
    */
  var maximum: Integer
  
  /**
    * A minimum value.
    */
  var minimum: Integer
}
object IntegerRange {
  
  inline def apply(maximum: Integer, minimum: Integer): IntegerRange = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerRange] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Integer): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Integer): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
