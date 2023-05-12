package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100DomainSetSpatialDomain extends StObject {
  
  /**
    * Spatial domain columns.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var columns: Double
  
  /**
    * Spatial domain extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var envelope: Extent
  
  /**
    * Spatial domain x, y offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var offset: CoverageDescriptionV100DomainSetSpatialDomainOffset
  
  /**
    * Spatial domain x, y origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var origin: CoverageDescriptionV100DomainSetSpatialDomainOrigin
  
  /**
    * Spatial domain rows.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
    */
  var rows: Double
}
object CoverageDescriptionV100DomainSetSpatialDomain {
  
  inline def apply(
    columns: Double,
    envelope: Extent,
    offset: CoverageDescriptionV100DomainSetSpatialDomainOffset,
    origin: CoverageDescriptionV100DomainSetSpatialDomainOrigin,
    rows: Double
  ): CoverageDescriptionV100DomainSetSpatialDomain = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100DomainSetSpatialDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100DomainSetSpatialDomain] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setEnvelope(value: Extent): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: CoverageDescriptionV100DomainSetSpatialDomainOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: CoverageDescriptionV100DomainSetSpatialDomainOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
