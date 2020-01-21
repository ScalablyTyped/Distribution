package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureReductionSelectionConstructor
  extends /**
  * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen. Labeling also respects this option and hides labels that would otherwise overlap with the features of this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
  */
Instantiable0[FeatureReductionSelection]
     with Instantiable1[/* properties */ FeatureReductionSelectionProperties, FeatureReductionSelection] {
  def fromJSON(json: js.Any): FeatureReductionSelection = js.native
}

