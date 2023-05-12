package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110Domain extends StObject {
  
  /**
    * Spatial extent or domain of a coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
    */
  var spatialDomain: CoverageDescriptionV110DomainSpatialDomain
}
object CoverageDescriptionV110Domain {
  
  inline def apply(spatialDomain: CoverageDescriptionV110DomainSpatialDomain): CoverageDescriptionV110Domain = {
    val __obj = js.Dynamic.literal(spatialDomain = spatialDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110Domain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110Domain] (val x: Self) extends AnyVal {
    
    inline def setSpatialDomain(value: CoverageDescriptionV110DomainSpatialDomain): Self = StObject.set(x, "spatialDomain", value.asInstanceOf[js.Any])
  }
}
