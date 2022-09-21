package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.NavigationToggle
import typings.arcgisJsApi.esri.NavigationToggleConstructor
import typings.arcgisJsApi.esri.NavigationToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationToggleMod extends Shortcut {
  
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NavigationToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/NavigationToggle", JSImport.Namespace)
  @js.native
  /**
    * Provides two simple buttons for toggling the [navigation mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode) of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle.html)
    */
  open class Class ()
    extends StObject
       with NavigationToggle {
    def this(properties: NavigationToggleProperties) = this()
  }
  
  type _To = js.Object & NavigationToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `navigationToggleMod.foo` */
  override def _to: js.Object & NavigationToggleConstructor = ^
}
