package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110DomainSpatialDomainOrigin extends StObject {
  
  /**
    * Spatial domain x origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var x: Double
  
  /**
    * Spatial domain y origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var y: Any
}
object CoverageDescriptionV110DomainSpatialDomainOrigin {
  
  inline def apply(x: Double, y: Any): CoverageDescriptionV110DomainSpatialDomainOrigin = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110DomainSpatialDomainOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110DomainSpatialDomainOrigin] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
