package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.left
import typings.arcgisJsApi.arcgisJsApiStrings.right
import typings.arcgisJsApi.arcgisJsApiStrings.top
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#background)
    */
  var background: js.UndefOr[ColorBackgroundProperties] = js.undefined
  
  /**
    * Represents the view's center point; when setting the center, you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing a longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.undefined
  
  /**
    * Specifies constraints to [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale), [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom), and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) that may be applied to the MapView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var constraints: js.UndefOr[MapViewConstraints] = js.undefined
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[MapViewHighlightOptionsProperties] = js.undefined
  
  /**
    * Defines which anchor stays still while resizing the browser window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    */
  var resizeAlign: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
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
  
  @scala.inline
  def apply(): MapViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewProperties]
  }
  
  @scala.inline
  implicit class MapViewPropertiesMutableBuilder[Self <: MapViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: ColorBackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setCenter(value: PointProperties | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: MapViewConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setHighlightOptions(value: MapViewHighlightOptionsProperties): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
    
    @scala.inline
    def setResizeAlign(
      value: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ): Self = StObject.set(x, "resizeAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeAlignUndefined: Self = StObject.set(x, "resizeAlign", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
