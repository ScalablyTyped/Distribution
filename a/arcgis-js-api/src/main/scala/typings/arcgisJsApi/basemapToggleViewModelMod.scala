package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapToggleViewModel
import typings.arcgisJsApi.esri.BasemapToggleViewModelConstructor
import typings.arcgisJsApi.esri.BasemapToggleViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapToggleViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapToggle/BasemapToggleViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapToggleViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapToggle/BasemapToggleViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [BasemapToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html)
    */
  open class Class ()
    extends StObject
       with BasemapToggleViewModel {
    def this(properties: BasemapToggleViewModelProperties) = this()
  }
  
  type _To = js.Object & BasemapToggleViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapToggleViewModelMod.foo` */
  override def _to: js.Object & BasemapToggleViewModelConstructor = ^
}
