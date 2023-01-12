package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacitySize extends StObject {
  
  /**
    * Specifies the endpoint capacity type.    INSTANCE_COUNT: The endpoint activates based on the number of instances.    CAPACITY_PERCENT: The endpoint activates based on the specified percentage of capacity.  
    */
  var Type: CapacitySizeType
  
  /**
    * Defines the capacity size, either as a number of instances or a capacity percentage.
    */
  var Value: CapacitySizeValue
}
object CapacitySize {
  
  inline def apply(Type: CapacitySizeType, Value: CapacitySizeValue): CapacitySize = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacitySize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacitySize] (val x: Self) extends AnyVal {
    
    inline def setType(value: CapacitySizeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CapacitySizeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
