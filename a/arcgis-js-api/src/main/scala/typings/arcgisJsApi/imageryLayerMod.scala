package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageryLayer
import typings.arcgisJsApi.esri.ImageryLayerConstructor
import typings.arcgisJsApi.esri.ImageryLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageryLayerMod extends Shortcut {
  
  @JSImport("esri/layers/ImageryLayer", JSImport.Namespace)
  @js.native
  val ^ : ImageryLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/ImageryLayer", JSImport.Namespace)
  @js.native
  /**
    * Represents an [image service resource](https://developers.arcgis.com/rest/services-reference/image-service.htm) as a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
    */
  class Class () extends ImageryLayer {
    def this(properties: ImageryLayerProperties) = this()
  }
  
  type _To = ImageryLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageryLayerMod.foo` */
  override def _to: ImageryLayerConstructor = ^
}
