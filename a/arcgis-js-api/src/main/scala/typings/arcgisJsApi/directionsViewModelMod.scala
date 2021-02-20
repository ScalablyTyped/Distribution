package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectionsViewModel
import typings.arcgisJsApi.esri.DirectionsViewModelConstructor
import typings.arcgisJsApi.esri.DirectionsViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionsViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Directions/DirectionsViewModel", JSImport.Namespace)
  @js.native
  val ^ : DirectionsViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Directions/DirectionsViewModel", JSImport.Namespace)
  @js.native
  class Class () extends DirectionsViewModel {
    def this(properties: DirectionsViewModelProperties) = this()
  }
  
  type _To = DirectionsViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directionsViewModelMod.foo` */
  override def _to: DirectionsViewModelConstructor = ^
}
