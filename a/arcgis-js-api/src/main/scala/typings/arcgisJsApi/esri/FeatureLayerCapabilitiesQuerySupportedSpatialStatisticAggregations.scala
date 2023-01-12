package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesQuerySupportedSpatialStatisticAggregations extends StObject {
  
  /**
    * Indicates if the layer can return centroid for each distinct group for [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#groupByFieldsForStatistics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var centroid: Boolean
  
  /**
    * Indicates if the layer can return convex hull for each distinct group for [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#groupByFieldsForStatistics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var convexHull: Boolean
  
  /**
    * Indicates if the layer can return extent for each distinct group for [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#groupByFieldsForStatistics).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var envelope: Boolean
}
object FeatureLayerCapabilitiesQuerySupportedSpatialStatisticAggregations {
  
  inline def apply(centroid: Boolean, convexHull: Boolean, envelope: Boolean): FeatureLayerCapabilitiesQuerySupportedSpatialStatisticAggregations = {
    val __obj = js.Dynamic.literal(centroid = centroid.asInstanceOf[js.Any], convexHull = convexHull.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesQuerySupportedSpatialStatisticAggregations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerCapabilitiesQuerySupportedSpatialStatisticAggregations] (val x: Self) extends AnyVal {
    
    inline def setCentroid(value: Boolean): Self = StObject.set(x, "centroid", value.asInstanceOf[js.Any])
    
    inline def setConvexHull(value: Boolean): Self = StObject.set(x, "convexHull", value.asInstanceOf[js.Any])
    
    inline def setEnvelope(value: Boolean): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
  }
}
