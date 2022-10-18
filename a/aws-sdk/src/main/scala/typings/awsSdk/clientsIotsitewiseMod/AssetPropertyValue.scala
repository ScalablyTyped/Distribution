package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyValue extends StObject {
  
  /**
    * The quality of the asset property value.
    */
  var quality: js.UndefOr[Quality] = js.undefined
  
  /**
    * The timestamp of the asset property value.
    */
  var timestamp: TimeInNanos
  
  /**
    * The value of the asset property (see Variant).
    */
  var value: Variant
}
object AssetPropertyValue {
  
  inline def apply(timestamp: TimeInNanos, value: Variant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  
  extension [Self <: AssetPropertyValue](x: Self) {
    
    inline def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTimestamp(value: TimeInNanos): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Variant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
