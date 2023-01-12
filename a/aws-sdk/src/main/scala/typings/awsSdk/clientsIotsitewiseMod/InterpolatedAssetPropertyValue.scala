package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolatedAssetPropertyValue extends StObject {
  
  var timestamp: TimeInNanos
  
  var value: Variant
}
object InterpolatedAssetPropertyValue {
  
  inline def apply(timestamp: TimeInNanos, value: Variant): InterpolatedAssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolatedAssetPropertyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolatedAssetPropertyValue] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: TimeInNanos): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Variant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
