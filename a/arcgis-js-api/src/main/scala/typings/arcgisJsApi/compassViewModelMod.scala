package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CompassViewModel
import typings.arcgisJsApi.esri.CompassViewModelConstructor
import typings.arcgisJsApi.esri.CompassViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compassViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Compass/CompassViewModel", JSImport.Namespace)
  @js.native
  val ^ : CompassViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Compass/CompassViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Compass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html)
    */
  class Class () extends CompassViewModel {
    def this(properties: CompassViewModelProperties) = this()
  }
  
  type _To = CompassViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `compassViewModelMod.foo` */
  override def _to: CompassViewModelConstructor = ^
}
