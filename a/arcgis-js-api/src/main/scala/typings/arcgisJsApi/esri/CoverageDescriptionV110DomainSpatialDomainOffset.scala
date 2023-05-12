package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110DomainSpatialDomainOffset extends StObject {
  
  /**
    * Spatial domain x offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var x: Double
  
  /**
    * Spatial domain y offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var y: Any
}
object CoverageDescriptionV110DomainSpatialDomainOffset {
  
  inline def apply(x: Double, y: Any): CoverageDescriptionV110DomainSpatialDomainOffset = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110DomainSpatialDomainOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110DomainSpatialDomainOffset] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
