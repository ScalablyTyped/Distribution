package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleBarViewModel
import typings.arcgisJsApi.esri.ScaleBarViewModelConstructor
import typings.arcgisJsApi.esri.ScaleBarViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleBarViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleBar/ScaleBarViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ScaleBarViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleBar/ScaleBarViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ScaleBarViewModel {
    def this(properties: ScaleBarViewModelProperties) = this()
  }
  
  type _To = js.Object & ScaleBarViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleBarViewModelMod.foo` */
  override def _to: js.Object & ScaleBarViewModelConstructor = ^
}
