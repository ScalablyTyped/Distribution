package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRangeSliderProperties extends WidgetProperties {
  
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale) values will match the layer's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  
  /**
    * The maximum scale of the active scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.native
  
  /**
    * The lowest possible maximum scale value on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScaleLimit)
    */
  var maxScaleLimit: js.UndefOr[Double] = js.native
  
  /**
    * The minimum scale of the active scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.native
  
  /**
    * The highest possible minimum scale value on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScaleLimit)
    */
  var minScaleLimit: js.UndefOr[Double] = js.native
  
  /**
    * The region that the scale thumbnails will focus on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#region)
    */
  var region: js.UndefOr[SupportedRegion] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ScaleRangeSliderViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#visibleElements)
    */
  var visibleElements: js.UndefOr[ScaleRangeSliderVisibleElements] = js.native
}
object ScaleRangeSliderProperties {
  
  @scala.inline
  def apply(): ScaleRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleRangeSliderProperties]
  }
  
  @scala.inline
  implicit class ScaleRangeSliderPropertiesMutableBuilder[Self <: ScaleRangeSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleLimit(value: Double): Self = StObject.set(x, "maxScaleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleLimitUndefined: Self = StObject.set(x, "maxScaleLimit", js.undefined)
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleLimit(value: Double): Self = StObject.set(x, "minScaleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleLimitUndefined: Self = StObject.set(x, "minScaleLimit", js.undefined)
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setRegion(value: SupportedRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: ScaleRangeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: ScaleRangeSliderVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
