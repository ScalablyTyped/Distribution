package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudLayer
import typings.arcgisJsApi.esri.PointCloudLayerConstructor
import typings.arcgisJsApi.esri.PointCloudLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudLayerMod extends Shortcut {
  
  @JSImport("esri/layers/PointCloudLayer", JSImport.Namespace)
  @js.native
  val ^ : PointCloudLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/PointCloudLayer", JSImport.Namespace)
  @js.native
  /**
    * The PointCloudLayer is designed for visualizing large collections of points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)
    */
  class Class () extends PointCloudLayer {
    def this(properties: PointCloudLayerProperties) = this()
  }
  
  type _To = PointCloudLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudLayerMod.foo` */
  override def _to: PointCloudLayerConstructor = ^
}
