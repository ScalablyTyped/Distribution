package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LayerListViewModel
import typings.arcgisJsApi.esri.LayerListViewModelConstructor
import typings.arcgisJsApi.esri.LayerListViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLayerListLayerListViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/LayerList/LayerListViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerListViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LayerList/LayerListViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html)
    */
  open class Class ()
    extends StObject
       with LayerListViewModel {
    def this(properties: LayerListViewModelProperties) = this()
  }
  
  type _To = js.Object & LayerListViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLayerListLayerListViewModelMod.foo` */
  override def _to: js.Object & LayerListViewModelConstructor = ^
}
