package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocateViewModel
import typings.arcgisJsApi.esri.LocateViewModelConstructor
import typings.arcgisJsApi.esri.LocateViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locateViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Locate/LocateViewModel", JSImport.Namespace)
  @js.native
  val ^ : LocateViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Locate/LocateViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Locate](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html)
    */
  class Class () extends LocateViewModel {
    def this(properties: LocateViewModelProperties) = this()
  }
  
  type _To = LocateViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `locateViewModelMod.foo` */
  override def _to: LocateViewModelConstructor = ^
}
