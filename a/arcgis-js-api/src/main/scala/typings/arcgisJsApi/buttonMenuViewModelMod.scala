package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ButtonMenuViewModel
import typings.arcgisJsApi.esri.ButtonMenuViewModelConstructor
import typings.arcgisJsApi.esri.ButtonMenuViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMenuViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ButtonMenuViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the module:esri/widgets/ButtonMenuItemConfig widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html)
    */
  open class Class ()
    extends StObject
       with ButtonMenuViewModel {
    def this(properties: ButtonMenuViewModelProperties) = this()
  }
  
  type _To = js.Object & ButtonMenuViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buttonMenuViewModelMod.foo` */
  override def _to: js.Object & ButtonMenuViewModelConstructor = ^
}
