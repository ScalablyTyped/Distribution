package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceViewModelProperties extends StObject {
  
  /**
    * Indicates whether the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) and layers that are draped on the ground surface are excluded from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface)
    */
  var excludeGroundSurface: js.UndefOr[Boolean] = js.native
  
  /**
    * Add layers to this collection to exclude them from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludedLayers)
    */
  var excludedLayers: js.UndefOr[CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]] = js.native
  
  /**
    * The shape used to slice elements in a 3D scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#shape)
    */
  var shape: js.UndefOr[SlicePlaneProperties] = js.native
  
  /**
    * Enable tilting the slice shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#tiltEnabled)
    */
  var tiltEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
}
object SliceViewModelProperties {
  
  @scala.inline
  def apply(): SliceViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceViewModelProperties]
  }
  
  @scala.inline
  implicit class SliceViewModelPropertiesMutableBuilder[Self <: SliceViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeGroundSurface(value: Boolean): Self = StObject.set(x, "excludeGroundSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeGroundSurfaceUndefined: Self = StObject.set(x, "excludeGroundSurface", js.undefined)
    
    @scala.inline
    def setExcludedLayers(value: CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]): Self = StObject.set(x, "excludedLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedLayersUndefined: Self = StObject.set(x, "excludedLayers", js.undefined)
    
    @scala.inline
    def setExcludedLayersVarargs(value: (LayerProperties | BuildingComponentSublayerProperties)*): Self = StObject.set(x, "excludedLayers", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: SlicePlaneProperties): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTiltEnabled(value: Boolean): Self = StObject.set(x, "tiltEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltEnabledUndefined: Self = StObject.set(x, "tiltEnabled", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
