package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.IntegratedMeshLayer
import typings.arcgisJsApi.esri.IntegratedMeshLayerConstructor
import typings.arcgisJsApi.esri.IntegratedMeshLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integratedMeshLayerMod extends Shortcut {
  
  @JSImport("esri/layers/IntegratedMeshLayer", JSImport.Namespace)
  @js.native
  val ^ : IntegratedMeshLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/IntegratedMeshLayer", JSImport.Namespace)
  @js.native
  /**
    * The IntegratedMeshLayer is designed for visualizing accurate representations in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) of infrastructure and natural landscapes that are difficult to access.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html)
    */
  class Class () extends IntegratedMeshLayer {
    def this(properties: IntegratedMeshLayerProperties) = this()
  }
  
  type _To = IntegratedMeshLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `integratedMeshLayerMod.foo` */
  override def _to: IntegratedMeshLayerConstructor = ^
}
