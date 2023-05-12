package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201DomainSetResolution extends StObject {
  
  /**
    * Resolution x.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var x: Double
  
  /**
    * Resolution.y.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var y: Double
}
object CoverageDescriptionV201DomainSetResolution {
  
  inline def apply(x: Double, y: Double): CoverageDescriptionV201DomainSetResolution = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201DomainSetResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201DomainSetResolution] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
