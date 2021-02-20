package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudRGBRenderer
import typings.arcgisJsApi.esri.PointCloudRGBRendererConstructor
import typings.arcgisJsApi.esri.PointCloudRGBRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudRGBRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudRGBRenderer", JSImport.Namespace)
  @js.native
  val ^ : PointCloudRGBRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudRGBRenderer", JSImport.Namespace)
  @js.native
  /**
    * PointCloudRGBRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a color attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html)
    */
  class Class () extends PointCloudRGBRenderer {
    def this(properties: PointCloudRGBRendererProperties) = this()
  }
  
  type _To = PointCloudRGBRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudRGBRendererMod.foo` */
  override def _to: PointCloudRGBRendererConstructor = ^
}
