package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudStretchRenderer
import typings.arcgisJsApi.esri.PointCloudStretchRendererConstructor
import typings.arcgisJsApi.esri.PointCloudStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudStretchRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  val ^ : PointCloudStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  /**
    * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
    */
  class Class () extends PointCloudStretchRenderer {
    def this(properties: PointCloudStretchRendererProperties) = this()
  }
  
  type _To = PointCloudStretchRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudStretchRendererMod.foo` */
  override def _to: PointCloudStretchRendererConstructor = ^
}
