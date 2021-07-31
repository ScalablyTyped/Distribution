package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Accessor
import typings.arcgisJsApi.esri.SpinnerViewModelConstructor
import typings.arcgisJsApi.esri.SpinnerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Spinner/SpinnerViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SpinnerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Spinner/SpinnerViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Accessor {
    def this(properties: SpinnerViewModelProperties) = this()
  }
  
  type _To = js.Object & SpinnerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `spinnerViewModelMod.foo` */
  override def _to: js.Object & SpinnerViewModelConstructor = ^
}
