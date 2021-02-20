package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapLayerList
import typings.arcgisJsApi.esri.BasemapLayerListConstructor
import typings.arcgisJsApi.esri.BasemapLayerListProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapLayerListMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapLayerList", JSImport.Namespace)
  @js.native
  val ^ : BasemapLayerListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapLayerList", JSImport.Namespace)
  @js.native
  /**
    * The BasemapLayerList widget provides a way to display a list of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers and switch on/off their visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html)
    */
  class Class () extends BasemapLayerList {
    def this(properties: BasemapLayerListProperties) = this()
  }
  
  type _To = BasemapLayerListConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapLayerListMod.foo` */
  override def _to: BasemapLayerListConstructor = ^
}
