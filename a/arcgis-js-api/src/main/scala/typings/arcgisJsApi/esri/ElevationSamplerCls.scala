package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ElevationSampler")
@js.native
/**
  * A cache of elevation values created from an elevation service or the [GroundView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html) used for synchronously querying elevation information for geometries. This class does not have a constructor. You can create an instance of this class by using [ElevationLayer.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler) or [Ground.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#createElevationSampler) methods. The elevation sampler created from the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) will sample data from the first elevation layer that has data available. To control the layer used for elevation sampling and the sampling resolution, use [ElevationLayer.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html)
  */
class ElevationSamplerCls () extends ElevationSampler

