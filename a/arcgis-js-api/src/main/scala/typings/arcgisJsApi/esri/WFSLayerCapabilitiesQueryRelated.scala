package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSLayerCapabilitiesQueryRelated extends StObject {
  
  /**
    * Indicates if the layer's query response includes the number of features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var supportsCount: Boolean
  
  /**
    * Indicates if the related features or records returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean
  
  /**
    * Indicates if the query response supports pagination for related features or records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var supportsPagination: Boolean
}
object WFSLayerCapabilitiesQueryRelated {
  
  inline def apply(supportsCount: Boolean, supportsOrderBy: Boolean, supportsPagination: Boolean): WFSLayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(supportsCount = supportsCount.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSLayerCapabilitiesQueryRelated]
  }
  
  extension [Self <: WFSLayerCapabilitiesQueryRelated](x: Self) {
    
    inline def setSupportsCount(value: Boolean): Self = StObject.set(x, "supportsCount", value.asInstanceOf[js.Any])
    
    inline def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
  }
}
