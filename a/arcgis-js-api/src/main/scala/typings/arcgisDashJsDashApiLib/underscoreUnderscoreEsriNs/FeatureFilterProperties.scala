package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFilterProperties extends js.Object {
  /**
    * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) in a spatial filter. The [units property](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#units) indicates the unit of measurement. In essence, setting this property creates a buffer at the specified size around the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The filter will use that buffer to display features in the layer or layer view that adhere to the to the indicated [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship).
    * > **Known Limitations**  On 3D object scene layers in [SceneLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html) `distance` is not supported .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#distance)
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship) will indicate how the geometry should be used to filter features.
    * > **Known Limitations**  [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html) geometry types are currently not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * An array of objectIds of the features to be filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * For spatial filters, this parameter defines the spatial relationship to filter features in the layer view against the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The spatial relationships discover how features are spatially related to each other. For example, you may want to know if a polygon representing a county completely contains points representing settlements.  The spatial relationship is determined by whether the boundaries or interiors of a geometry intersect.
    *   * Boundary — The endpoints of all linear parts for line features, or the linear outline of a polygon. Only lines and polygons have boundaries.
    *   * Interior — Points are entirely interior and have no boundary. For lines and polygons, the interior is any part of the geometry that is not part of the boundary.
    *
    *
    * The possible values for this parameter are described below and the images highlight the geometries returned for the specified spatial relationship for given geometries.  The `intersects` spatial relationship returns features in the layer view that intersect the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).
    * > **Known Limitations**  The filter of [SceneLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html) with 3D object scene layers only supports the spatialRelationsship `contains`, `intersects` and `disjoint`.
    * ![intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/intersects.png)  The `contains` spatial relationship returns features in the layer view that are completely contained by the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).  ![contains](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/contains.png)  The `crosses` spatial relationship returns features in the layer view when the interior of a filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) comes into contact with the interior or boundary of features in the layer view. In other words, the geometries share some interior area, but not all interior area.  ![crosses](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/crosses.png)  The `envelope-intersects` spatial relationship returns features in the layer view that intersect the envelope (or extent) of the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).  ![envelope-intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/envelope-intersects.png)  The `overlaps` spatial relationship returns features in the layer view that overlap the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). Only features of the same geometry can be compared.  ![overlaps](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/overlap.png)  The `touches` spatial relationship returns features in the layer view that touch the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The boundaries of the geometries intersect, but not their interiors.  ![touches](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/touches.png)  The `within` spatial relationship returns features in the layer view that completely contain the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). In other words, the filter geometry is completely `within` the features in the layer view. It is opposite of `contains`.  ![within](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/within.png)  The `disjoint` spatial relationship returns features in the layer view that do not intersect the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) in anyway. Opposite of `intersects`.  ![disjoint](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/disjoint.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship)
    *
    * @default intersects
    */
  var spatialRelationship: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A range of time with start and end date. Only the features that fall within this time extent will be displayed.
    * > **Known Limitations**  On 3D object scene layers in [SceneLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html) `timeExtent` is not supported .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#distance) is specified in a spatial filter. If `units` is not specified, the unit is derived from the filter [geometry's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) spatial reference.  **Possible Values:** feet | miles | nautical-miles | us-nautical-miles | meters | kilometers
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#units)
    *
    * @default null
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A where clause for the feature filter. Any legal SQL92 where clause operating on the fields in the layer is allowed. Be sure to have the correct sequence of single and double quotes when writing the where clause in JavaScript. The field to be used for `where` clause must be added to [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields) list when the layer is initialized.
    * > **Known Limitations**  On 3D object scene layers in [SceneLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html) `where` is not supported .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where)
    */
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object FeatureFilterProperties {
  @scala.inline
  def apply(
    distance: scala.Int | scala.Double = null,
    geometry: GeometryProperties = null,
    objectIds: js.Array[scala.Double] = null,
    spatialRelationship: java.lang.String = null,
    timeExtent: TimeExtentProperties = null,
    units: java.lang.String = null,
    where: java.lang.String = null
  ): FeatureFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    if (spatialRelationship != null) __obj.updateDynamic("spatialRelationship")(spatialRelationship)
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent)
    if (units != null) __obj.updateDynamic("units")(units)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[FeatureFilterProperties]
  }
}

