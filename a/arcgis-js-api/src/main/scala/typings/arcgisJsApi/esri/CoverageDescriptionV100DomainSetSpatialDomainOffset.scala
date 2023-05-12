package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100DomainSetSpatialDomainOffset extends StObject {
  
  /**
    * Spatial domain x offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var x: Double
  
  /**
    * Spatial domain y offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var y: Any
}
object CoverageDescriptionV100DomainSetSpatialDomainOffset {
  
  inline def apply(x: Double, y: Any): CoverageDescriptionV100DomainSetSpatialDomainOffset = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100DomainSetSpatialDomainOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100DomainSetSpatialDomainOffset] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
