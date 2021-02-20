package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureReductionSelection
import typings.arcgisJsApi.esri.FeatureReductionSelectionConstructor
import typings.arcgisJsApi.esri.FeatureReductionSelectionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureReductionSelectionMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  val ^ : FeatureReductionSelectionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  /**
    * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
    */
  class Class () extends FeatureReductionSelection {
    def this(properties: FeatureReductionSelectionProperties) = this()
  }
  
  type _To = FeatureReductionSelectionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureReductionSelectionMod.foo` */
  override def _to: FeatureReductionSelectionConstructor = ^
}
