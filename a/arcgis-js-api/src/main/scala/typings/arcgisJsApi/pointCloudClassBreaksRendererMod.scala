package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererConstructor
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudClassBreaksRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudClassBreaksRenderer", JSImport.Namespace)
  @js.native
  val ^ : PointCloudClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudClassBreaksRenderer", JSImport.Namespace)
  @js.native
  /**
    * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
    */
  class Class () extends PointCloudClassBreaksRenderer {
    def this(properties: PointCloudClassBreaksRendererProperties) = this()
  }
  
  type _To = PointCloudClassBreaksRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudClassBreaksRendererMod.foo` */
  override def _to: PointCloudClassBreaksRendererConstructor = ^
}
