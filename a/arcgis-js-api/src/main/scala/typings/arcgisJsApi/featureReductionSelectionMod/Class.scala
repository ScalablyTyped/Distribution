package typings.arcgisJsApi.featureReductionSelectionMod

import typings.arcgisJsApi.esri.FeatureReductionSelection
import typings.arcgisJsApi.esri.FeatureReductionSelectionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
@js.native
/**
  * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen. Labeling also respects this option and hides labels that would otherwise overlap with the features of this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
  */
class Class () extends FeatureReductionSelection {
  def this(properties: FeatureReductionSelectionProperties) = this()
}

