package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFilterProperties extends js.Object {
  /**
    * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) in a spatial filter. The [units property](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#units) indicates the unit of measurement. In essence, setting this property creates a buffer at the specified size around the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The filter will use that buffer to display features in the layer or layer view that adhere to the to the indicated [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#distance)
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship) will indicate how the geometry should be used to filter features.
    * > **Known Limitations**  [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html) geometry types are currently not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  /**
    * An array of objectIds of the features to be filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For spatial filters, this parameter defines the spatial relationship to filter features in the layer view against the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The spatial relationships discover how features are spatially related to each other. For example, you may want to know if a polygon representing a county completely contains points representing settlements.  The spatial relationship is determined by whether the boundaries or interiors of a geometry intersect.
    *   * Boundary — The endpoints of all linear parts for line features, or the linear outline of a polygon. Only lines and polygons have boundaries.
    *   * Interior — Points are entirely interior and have no boundary. For lines and polygons, the interior is any part of the geometry that is not part of the boundary.
    *
    *
    * The possible values for this parameter are described below and the images highlight the geometries returned for the specified spatial relationship for given geometries.  The `intersects` spatial relationship returns features in the layer view that intersect the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).
    * > **Known Limitations**  The filter of [SceneLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html) with 3D object scene layers only supports the spatial relationships `contains`, `intersects` and `disjoint`.
    * ![intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/intersects.png)  The `contains` spatial relationship returns features in the layer view that are completely contained by the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).  ![contains](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/contains.png)  The `crosses` spatial relationship returns features in the layer view when the interior of a filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) comes into contact with the interior or boundary of features in the layer view. In other words, the geometries share some interior area, but not all interior area.  ![crosses](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/crosses.png)  The `envelope-intersects` spatial relationship returns features in the layer view that intersect the envelope (or extent) of the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry).  ![envelope-intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/envelope-intersects.png)  The `overlaps` spatial relationship returns features in the layer view that overlap the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). Only features of the same geometry can be compared.  ![overlaps](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/overlap.png)  The `touches` spatial relationship returns features in the layer view that touch the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). The boundaries of the geometries intersect, but not their interiors.  ![touches](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/touches.png)  The `within` spatial relationship returns features in the layer view that completely contain the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry). In other words, the filter geometry is completely `within` the features in the layer view. It is opposite of `contains`.  ![within](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/within.png)  The `disjoint` spatial relationship returns features in the layer view that do not intersect the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) in anyway. Opposite of `intersects`.  ![disjoint](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/disjoint.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship)
    *
    * @default intersects
    */
  var spatialRelationship: js.UndefOr[String] = js.native
  /**
    * A range of time with start and end date. Only the features that fall within this time extent will be displayed. The Date field to be used for `timeExtent` should be added to [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields) list when the layer is initialized. This ensures the best user experience when switching or updating fields for time filters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
  /**
    * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#distance) is specified in a spatial filter. If `units` is not specified, the unit is derived from the filter [geometry's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry) spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#units)
    *
    * @default null
    */
  var units: js.UndefOr[feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_] = js.native
  /**
    * A where clause for the feature filter. Any legal SQL92 where clause operating on the fields in the layer is allowed. Be sure to have the correct sequence of single and double quotes when writing the where clause in JavaScript.  For apps where users can interactively change fields used for attribute filter, we suggest you include all possible fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields) of the layer. This ensures the best user experience when switching or updating fields for attribute filters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where)
    */
  var where: js.UndefOr[String] = js.native
}

object FeatureFilterProperties {
  @scala.inline
  def apply(): FeatureFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFilterProperties]
  }
  @scala.inline
  implicit class FeatureFilterPropertiesOps[Self <: FeatureFilterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    @scala.inline
    def setSpatialRelationship(value: String): Self = this.set("spatialRelationship", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialRelationship: Self = this.set("spatialRelationship", js.undefined)
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeExtent: Self = this.set("timeExtent", js.undefined)
    @scala.inline
    def setUnits(value: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

