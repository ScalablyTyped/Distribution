package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceValue extends StObject {
  
  /**
    * The value is a resource ID.
    */
  var Value: ResourceValueType
}
object ResourceValue {
  
  inline def apply(Value: ResourceValueType): ResourceValue = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: ResourceValueType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
