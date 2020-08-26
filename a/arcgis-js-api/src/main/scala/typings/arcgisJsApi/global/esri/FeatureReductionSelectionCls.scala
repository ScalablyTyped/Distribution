package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureReductionSelectionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.FeatureReductionSelection")
@js.native
/**
  * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen. Labeling also respects this option and hides labels that would otherwise overlap with the features of this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
  */
class FeatureReductionSelectionCls ()
  extends typings.arcgisJsApi.esri.FeatureReductionSelection {
  def this(properties: FeatureReductionSelectionProperties) = this()
}

