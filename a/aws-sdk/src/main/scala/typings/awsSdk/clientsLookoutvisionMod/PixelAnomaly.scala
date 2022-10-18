package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelAnomaly extends StObject {
  
  /**
    * A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color. The color maps to the color of the anomaly type used in the training dataset. 
    */
  var Color: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.Color] = js.undefined
  
  /**
    * The percentage area of the image that the anomaly type covers.
    */
  var TotalPercentageArea: js.UndefOr[Float] = js.undefined
}
object PixelAnomaly {
  
  inline def apply(): PixelAnomaly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelAnomaly]
  }
  
  extension [Self <: PixelAnomaly](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setTotalPercentageArea(value: Float): Self = StObject.set(x, "TotalPercentageArea", value.asInstanceOf[js.Any])
    
    inline def setTotalPercentageAreaUndefined: Self = StObject.set(x, "TotalPercentageArea", js.undefined)
  }
}
