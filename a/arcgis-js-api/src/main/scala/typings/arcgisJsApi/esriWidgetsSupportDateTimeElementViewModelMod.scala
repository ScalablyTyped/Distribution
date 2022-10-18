package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.DateTimeElementViewModel
import typings.arcgisJsApi.esri.DateTimeElementViewModelConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportDateTimeElementViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/DateTimeElementViewModel", JSImport.Namespace)
  @js.native
  val ^ : DateTimeElementViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/DateTimeElementViewModel", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with DateTimeElementViewModel {
    
    /**
      * The current state of the widget.
      *
      * @default ready
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#state)
      */
    /* CompleteClass */
    var state: ready = js.native
    
    /**
      * The selected date.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#value)
      */
    /* CompleteClass */
    var value: js.Date = js.native
  }
  
  type _To = DateTimeElementViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportDateTimeElementViewModelMod.foo` */
  override def _to: DateTimeElementViewModelConstructor = ^
}
