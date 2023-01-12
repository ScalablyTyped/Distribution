package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyValue extends StObject {
  
  /**
    * The quality of the asset property value. The value must be 'GOOD', 'BAD', or 'UNCERTAIN'.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.undefined
  
  /**
    * The timestamp associated with the asset property value. The default is the current event time.
    */
  var timestamp: js.UndefOr[AssetPropertyTimestamp] = js.undefined
  
  /**
    * The value to send to an asset property.
    */
  var value: js.UndefOr[AssetPropertyVariant] = js.undefined
}
object AssetPropertyValue {
  
  inline def apply(): AssetPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetPropertyValue] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: AssetPropertyQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTimestamp(value: AssetPropertyTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: AssetPropertyVariant): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
