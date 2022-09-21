package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.NavigationToggleViewModel
import typings.arcgisJsApi.esri.NavigationToggleViewModelConstructor
import typings.arcgisJsApi.esri.NavigationToggleViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationToggleViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/NavigationToggle/NavigationToggleViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NavigationToggleViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/NavigationToggle/NavigationToggleViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [NavigationToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html) widget, which provides two simple buttons for toggling the [navigation mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode) of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html)
    */
  open class Class ()
    extends StObject
       with NavigationToggleViewModel {
    def this(properties: NavigationToggleViewModelProperties) = this()
  }
  
  type _To = js.Object & NavigationToggleViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `navigationToggleViewModelMod.foo` */
  override def _to: js.Object & NavigationToggleViewModelConstructor = ^
}
