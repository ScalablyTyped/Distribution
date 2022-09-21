package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.PointPropertiestypepoint
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.left_
import typings.arcgisJsApi.arcgisJsApiStrings.right_
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewProperties
  extends StObject
     with ViewProperties
     with BreakpointsOwnerProperties {
  
  /**
    * The background color of the MapView.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#background)
    */
  var background: js.UndefOr[ColorBackgroundProperties] = js.undefined
  
  /**
    * Represents the view's center point; when setting the center, you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing a longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center)
    */
  var center: js.UndefOr[PointPropertiestypepoint | js.Array[Double]] = js.undefined
  
  /**
    * Specifies constraints to [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale), [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom), and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) that may be applied to the MapView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var constraints: js.UndefOr[MapViewConstraints] = js.undefined
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Applies a display filter on the view for a specific set of floor levels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#floors)
    */
  var floors: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[MapViewHighlightOptionsProperties] = js.undefined
  
  /**
    * Defines which anchor stays still while resizing the browser window.
    *
    * @default center
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    */
  var resizeAlign: js.UndefOr[
    center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates if the MapView's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReference) can be changed after it is initialized.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReferenceLocked)
    */
  var spatialReferenceLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object MapViewProperties {
  
  inline def apply(): MapViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewProperties]
  }
  
  extension [Self <: MapViewProperties](x: Self) {
    
    inline def setBackground(value: ColorBackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCenter(value: PointPropertiestypepoint | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setConstraints(value: MapViewConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFloors(value: CollectionProperties[String]): Self = StObject.set(x, "floors", value.asInstanceOf[js.Any])
    
    inline def setFloorsUndefined: Self = StObject.set(x, "floors", js.undefined)
    
    inline def setFloorsVarargs(value: String*): Self = StObject.set(x, "floors", js.Array(value*))
    
    inline def setHighlightOptions(value: MapViewHighlightOptionsProperties): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    inline def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
    
    inline def setResizeAlign(
      value: center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ): Self = StObject.set(x, "resizeAlign", value.asInstanceOf[js.Any])
    
    inline def setResizeAlignUndefined: Self = StObject.set(x, "resizeAlign", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSpatialReferenceLocked(value: Boolean): Self = StObject.set(x, "spatialReferenceLocked", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceLockedUndefined: Self = StObject.set(x, "spatialReferenceLocked", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
