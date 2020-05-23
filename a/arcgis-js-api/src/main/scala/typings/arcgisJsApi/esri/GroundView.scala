package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundView extends Accessor {
  /**
    * An elevation sampler that may be used to sample and query elevation values from the ground surface that is currently being displayed.  The elevation sampler is not supported for [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and may be `null` while the ground surface display is being initialized.  The resolution of the sampled values depends on the ground elevation display resolution (high resolution close to the camera, low resolution far away from the camera). Because of the dynamic nature of the display resolution, the [demResolution](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#demResolution) property of the returned sampler will always return `{ min: -1, max: -1 }.  If higher or more consistent sample resolution is required, then consider creating a sampler at the desired resolution using ElevationLayer.createSampler or Ground.createSampler.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#elevationSampler)
    */
  val elevationSampler: ElevationSampler = js.native
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) in the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#layerViews)
    */
  val layerViews: Collection[LayerView] = js.native
  /**
    * Value is `true` when any of the ground layer views are updating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html#updating)
    *
    * @default false
    */
  val updating: Boolean = js.native
}

