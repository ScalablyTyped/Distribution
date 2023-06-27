package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110DomainSpatialDomain extends StObject {
  
  /**
  		 * Spatial domain columns.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var columns: Double
  
  /**
  		 * Spatial domain extent.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var envelope: Extent
  
  /**
  		 * Spatial domain x, y offset.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var offset: CoverageDescriptionV110DomainSpatialDomainOffset
  
  /**
  		 * Spatial domain x, y origin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var origin: CoverageDescriptionV110DomainSpatialDomainOrigin
  
  /**
  		 * Spatial domain rows.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var rows: Double
}
object CoverageDescriptionV110DomainSpatialDomain {
  
  inline def apply(
    columns: Double,
    envelope: Extent,
    offset: CoverageDescriptionV110DomainSpatialDomainOffset,
    origin: CoverageDescriptionV110DomainSpatialDomainOrigin,
    rows: Double
  ): CoverageDescriptionV110DomainSpatialDomain = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110DomainSpatialDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110DomainSpatialDomain] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setEnvelope(value: Extent): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: CoverageDescriptionV110DomainSpatialDomainOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: CoverageDescriptionV110DomainSpatialDomainOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
