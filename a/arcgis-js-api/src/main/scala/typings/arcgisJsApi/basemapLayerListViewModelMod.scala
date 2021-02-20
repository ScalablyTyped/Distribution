package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapLayerListViewModel
import typings.arcgisJsApi.esri.BasemapLayerListViewModelConstructor
import typings.arcgisJsApi.esri.BasemapLayerListViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapLayerListViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapLayerList/BasemapLayerListViewModel", JSImport.Namespace)
  @js.native
  val ^ : BasemapLayerListViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapLayerList/BasemapLayerListViewModel", JSImport.Namespace)
  @js.native
  class Class () extends BasemapLayerListViewModel {
    def this(properties: BasemapLayerListViewModelProperties) = this()
  }
  
  type _To = BasemapLayerListViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapLayerListViewModelMod.foo` */
  override def _to: BasemapLayerListViewModelConstructor = ^
}
