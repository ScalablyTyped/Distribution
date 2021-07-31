package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.MomentElementViewModel
import typings.arcgisJsApi.esri.MomentElementViewModelConstructor
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentElementViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/MomentElementViewModel", JSImport.Namespace)
  @js.native
  val ^ : MomentElementViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/MomentElementViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with MomentElementViewModel {
    
    /**
      * The current state of the widget.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#state)
      */
    /* CompleteClass */
    var state: ready = js.native
    
    /**
      * The selected date.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#value)
      */
    /* CompleteClass */
    var value: Date = js.native
  }
  
  type _To = MomentElementViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `momentElementViewModelMod.foo` */
  override def _to: MomentElementViewModelConstructor = ^
}
