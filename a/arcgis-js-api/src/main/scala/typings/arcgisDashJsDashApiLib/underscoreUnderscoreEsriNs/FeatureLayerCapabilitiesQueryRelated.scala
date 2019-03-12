package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesQueryRelated
  extends stdLib.Object {
  /**
    * Indicates if the layer's query response includes the number of features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCount: scala.Boolean
  /**
    * Indicates if the related features or records returned in the query response can be ordered by one or more fields. Requires ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsOrderBy: scala.Boolean
  /**
    * Indicates if the query response supports pagination for related features or records. Requires ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsPagination: scala.Boolean
}

object FeatureLayerCapabilitiesQueryRelated {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsCount: scala.Boolean,
    supportsOrderBy: scala.Boolean,
    supportsPagination: scala.Boolean
  ): FeatureLayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCount = supportsCount, supportsOrderBy = supportsOrderBy, supportsPagination = supportsPagination)
  
    __obj.asInstanceOf[FeatureLayerCapabilitiesQueryRelated]
  }
}

