package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100DomainSetSpatialDomainOrigin extends StObject {
  
  /**
  		 * Spatial domain x origin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var x: Double
  
  /**
  		 * Spatial domain y origin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var y: Any
}
object CoverageDescriptionV100DomainSetSpatialDomainOrigin {
  
  inline def apply(x: Double, y: Any): CoverageDescriptionV100DomainSetSpatialDomainOrigin = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100DomainSetSpatialDomainOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100DomainSetSpatialDomainOrigin] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
