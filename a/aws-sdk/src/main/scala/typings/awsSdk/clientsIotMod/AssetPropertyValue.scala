package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyValue extends StObject {
  
  /**
    * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be GOOD, BAD, or UNCERTAIN.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.undefined
  
  /**
    * The asset property value timestamp.
    */
  var timestamp: AssetPropertyTimestamp
  
  /**
    * The value of the asset property.
    */
  var value: AssetPropertyVariant
}
object AssetPropertyValue {
  
  inline def apply(timestamp: AssetPropertyTimestamp, value: AssetPropertyVariant): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
  
  extension [Self <: AssetPropertyValue](x: Self) {
    
    inline def setQuality(value: AssetPropertyQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTimestamp(value: AssetPropertyTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AssetPropertyVariant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
