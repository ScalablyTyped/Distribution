package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureLayerView
import typings.arcgisJsApi.esri.FeatureLayerViewConstructor
import typings.arcgisJsApi.esri.FeatureLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/FeatureLayerView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/FeatureLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html)
    */
  class Class ()
    extends StObject
       with FeatureLayerView {
    def this(properties: FeatureLayerViewProperties) = this()
  }
  
  type _To = js.Object & FeatureLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureLayerViewMod.foo` */
  override def _to: js.Object & FeatureLayerViewConstructor = ^
}
