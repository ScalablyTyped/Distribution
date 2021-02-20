package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BaseDynamicLayer
import typings.arcgisJsApi.esri.BaseDynamicLayerConstructor
import typings.arcgisJsApi.esri.BaseDynamicLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDynamicLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BaseDynamicLayer", JSImport.Namespace)
  @js.native
  val ^ : BaseDynamicLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BaseDynamicLayer", JSImport.Namespace)
  @js.native
  /**
    * This class may be extended to create dynamic map layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html)
    */
  class Class () extends BaseDynamicLayer {
    def this(properties: BaseDynamicLayerProperties) = this()
  }
  
  type _To = BaseDynamicLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `baseDynamicLayerMod.foo` */
  override def _to: BaseDynamicLayerConstructor = ^
}
