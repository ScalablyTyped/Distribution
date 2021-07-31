package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewConstraints
  extends StObject
     with Object {
  
  /**
    * A read-only property that specifies the levels of detail (LODs) read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveLODs: js.UndefOr[js.Array[LOD]] = js.undefined
  
  /**
    * A read-only property that specifies the maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * A read-only property that specifies the maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMaxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * A read-only property that specifies the minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinScale: js.UndefOr[Double] = js.undefined
  
  /**
    * A read-only property that specifies the minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var effectiveMinZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * The area in which the user is allowed to navigate laterally.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var geometry: js.UndefOr[Geometry_] = js.undefined
  
  /**
    * An array of [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var lods: js.UndefOr[js.Array[LOD]] = js.undefined
  
  /**
    * The maximum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) level the user is allowed to zoom to within the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the user can rotate the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var rotationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the view snaps to the next LOD when zooming in or out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var snapToZoom: js.UndefOr[Boolean] = js.undefined
}
object MapViewConstraints {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapViewConstraints = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapViewConstraints]
  }
  
  @scala.inline
  implicit class MapViewConstraintsMutableBuilder[Self <: MapViewConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveLODs(value: js.Array[LOD]): Self = StObject.set(x, "effectiveLODs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveLODsUndefined: Self = StObject.set(x, "effectiveLODs", js.undefined)
    
    @scala.inline
    def setEffectiveLODsVarargs(value: LOD*): Self = StObject.set(x, "effectiveLODs", js.Array(value :_*))
    
    @scala.inline
    def setEffectiveMaxScale(value: Double): Self = StObject.set(x, "effectiveMaxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMaxScaleUndefined: Self = StObject.set(x, "effectiveMaxScale", js.undefined)
    
    @scala.inline
    def setEffectiveMaxZoom(value: Double): Self = StObject.set(x, "effectiveMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMaxZoomUndefined: Self = StObject.set(x, "effectiveMaxZoom", js.undefined)
    
    @scala.inline
    def setEffectiveMinScale(value: Double): Self = StObject.set(x, "effectiveMinScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMinScaleUndefined: Self = StObject.set(x, "effectiveMinScale", js.undefined)
    
    @scala.inline
    def setEffectiveMinZoom(value: Double): Self = StObject.set(x, "effectiveMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMinZoomUndefined: Self = StObject.set(x, "effectiveMinZoom", js.undefined)
    
    @scala.inline
    def setGeometry(value: Geometry_): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setLods(value: js.Array[LOD]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodsUndefined: Self = StObject.set(x, "lods", js.undefined)
    
    @scala.inline
    def setLodsVarargs(value: LOD*): Self = StObject.set(x, "lods", js.Array(value :_*))
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
    
    @scala.inline
    def setSnapToZoom(value: Boolean): Self = StObject.set(x, "snapToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToZoomUndefined: Self = StObject.set(x, "snapToZoom", js.undefined)
  }
}
