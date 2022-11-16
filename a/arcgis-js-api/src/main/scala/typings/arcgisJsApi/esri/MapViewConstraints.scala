package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewConstraints extends StObject {
  
  /**
    * A read-only property that specifies the levels of  detail (LODs) read from the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
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
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var rotationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the view snaps to the next LOD when zooming in or out.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var snapToZoom: js.UndefOr[Boolean] = js.undefined
}
object MapViewConstraints {
  
  inline def apply(): MapViewConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewConstraints]
  }
  
  extension [Self <: MapViewConstraints](x: Self) {
    
    inline def setEffectiveLODs(value: js.Array[LOD]): Self = StObject.set(x, "effectiveLODs", value.asInstanceOf[js.Any])
    
    inline def setEffectiveLODsUndefined: Self = StObject.set(x, "effectiveLODs", js.undefined)
    
    inline def setEffectiveLODsVarargs(value: LOD*): Self = StObject.set(x, "effectiveLODs", js.Array(value*))
    
    inline def setEffectiveMaxScale(value: Double): Self = StObject.set(x, "effectiveMaxScale", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMaxScaleUndefined: Self = StObject.set(x, "effectiveMaxScale", js.undefined)
    
    inline def setEffectiveMaxZoom(value: Double): Self = StObject.set(x, "effectiveMaxZoom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMaxZoomUndefined: Self = StObject.set(x, "effectiveMaxZoom", js.undefined)
    
    inline def setEffectiveMinScale(value: Double): Self = StObject.set(x, "effectiveMinScale", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMinScaleUndefined: Self = StObject.set(x, "effectiveMinScale", js.undefined)
    
    inline def setEffectiveMinZoom(value: Double): Self = StObject.set(x, "effectiveMinZoom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMinZoomUndefined: Self = StObject.set(x, "effectiveMinZoom", js.undefined)
    
    inline def setGeometry(value: Geometry_): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setLods(value: js.Array[LOD]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    inline def setLodsUndefined: Self = StObject.set(x, "lods", js.undefined)
    
    inline def setLodsVarargs(value: LOD*): Self = StObject.set(x, "lods", js.Array(value*))
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
    
    inline def setSnapToZoom(value: Boolean): Self = StObject.set(x, "snapToZoom", value.asInstanceOf[js.Any])
    
    inline def setSnapToZoomUndefined: Self = StObject.set(x, "snapToZoom", js.undefined)
  }
}
