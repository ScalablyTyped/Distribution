package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SwipeViewModel
import typings.arcgisJsApi.esri.SwipeViewModelConstructor
import typings.arcgisJsApi.esri.SwipeViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSwipeSwipeViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SwipeViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html)
    */
  open class Class ()
    extends StObject
       with SwipeViewModel {
    def this(properties: SwipeViewModelProperties) = this()
  }
  
  type _To = js.Object & SwipeViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSwipeSwipeViewModelMod.foo` */
  override def _to: js.Object & SwipeViewModelConstructor = ^
}
