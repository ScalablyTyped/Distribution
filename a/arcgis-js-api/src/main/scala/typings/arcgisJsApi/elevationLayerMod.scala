package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationLayer
import typings.arcgisJsApi.esri.ElevationLayerConstructor
import typings.arcgisJsApi.esri.ElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationLayerMod extends Shortcut {
  
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : ElevationLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
    */
  class Class () extends ElevationLayer {
    def this(properties: ElevationLayerProperties) = this()
  }
  
  type _To = ElevationLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationLayerMod.foo` */
  override def _to: ElevationLayerConstructor = ^
}
