package typings.arcgisDashJsDashApi.esriLayersSupportFeatureReductionSelectionMod

import typings.arcgisDashJsDashApi.__esri.FeatureReductionSelection
import typings.arcgisDashJsDashApi.__esri.FeatureReductionSelectionProperties
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
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

