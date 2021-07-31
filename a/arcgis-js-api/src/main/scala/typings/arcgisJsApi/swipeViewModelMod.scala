package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SwipeViewModel
import typings.arcgisJsApi.esri.SwipeViewModelConstructor
import typings.arcgisJsApi.esri.SwipeViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SwipeViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Swipe/SwipeViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with SwipeViewModel {
    def this(properties: SwipeViewModelProperties) = this()
  }
  
  type _To = js.Object & SwipeViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `swipeViewModelMod.foo` */
  override def _to: js.Object & SwipeViewModelConstructor = ^
}
