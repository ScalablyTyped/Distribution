package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.FeatureFilter")
@js.native
/**
  * This class defines parameters for setting a client-side filter on a [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html). Once a FeatureFilter object's properties are defined, it can be used to set the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter) property of the layer view.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html)
  */
class FeatureFilterCls ()
  extends typings.arcgisJsApi.esri.FeatureFilter {
  def this(properties: FeatureFilterProperties) = this()
}

