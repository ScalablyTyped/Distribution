package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingSceneLayer
import typings.arcgisJsApi.esri.BuildingSceneLayerConstructor
import typings.arcgisJsApi.esri.BuildingSceneLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingSceneLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BuildingSceneLayer", JSImport.Namespace)
  @js.native
  val ^ : BuildingSceneLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BuildingSceneLayer", JSImport.Namespace)
  @js.native
  /**
    * The BuildingSceneLayer is designed for visualizing buildings with detailed interiors in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html)
    */
  class Class () extends BuildingSceneLayer {
    def this(properties: BuildingSceneLayerProperties) = this()
  }
  
  type _To = BuildingSceneLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingSceneLayerMod.foo` */
  override def _to: BuildingSceneLayerConstructor = ^
}
