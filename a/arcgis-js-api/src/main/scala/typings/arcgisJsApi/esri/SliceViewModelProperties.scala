package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceViewModelProperties extends js.Object {
  /**
    * Indicates whether the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) and layers that are draped on the ground surface are excluded from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface)
    *
    * @default false
    */
  var excludeGroundSurface: js.UndefOr[Boolean] = js.native
  /**
    * Add layers to this collection to exclude them from the slice. Layers that are draped on the ground surface are not affected by this property
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludedLayers)
    */
  var excludedLayers: js.UndefOr[CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]] = js.native
  /**
    * The shape used to slice elements in a 3D scene. Currently the only supported shape is a plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#shape)
    */
  var shape: js.UndefOr[SlicePlaneProperties] = js.native
  /**
    * Enable tilting the slice shape. If set to true, the slice shape will orient itself as best as possible to the surface under the cursor when first placing the shape. If set to false, the slice shape is restricted to be either horizontal or vertical.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#tiltEnabled)
    *
    * @default false
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
  implicit class SliceViewModelPropertiesOps[Self <: SliceViewModelProperties] (val x: Self) extends AnyVal {
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
    def setExcludeGroundSurface(value: Boolean): Self = this.set("excludeGroundSurface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeGroundSurface: Self = this.set("excludeGroundSurface", js.undefined)
    @scala.inline
    def setExcludedLayersVarargs(value: (LayerProperties | BuildingComponentSublayerProperties)*): Self = this.set("excludedLayers", js.Array(value :_*))
    @scala.inline
    def setExcludedLayers(value: CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]): Self = this.set("excludedLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedLayers: Self = this.set("excludedLayers", js.undefined)
    @scala.inline
    def setShape(value: SlicePlaneProperties): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setTiltEnabled(value: Boolean): Self = this.set("tiltEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiltEnabled: Self = this.set("tiltEnabled", js.undefined)
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

