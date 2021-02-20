package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PopupViewModel
import typings.arcgisJsApi.esri.PopupViewModelConstructor
import typings.arcgisJsApi.esri.PopupViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Popup/PopupViewModel", JSImport.Namespace)
  @js.native
  val ^ : PopupViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Popup/PopupViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) widget, which allows users to view content from feature attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html)
    */
  class Class () extends PopupViewModel {
    def this(properties: PopupViewModelProperties) = this()
  }
  
  type _To = PopupViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `popupViewModelMod.foo` */
  override def _to: PopupViewModelConstructor = ^
}
