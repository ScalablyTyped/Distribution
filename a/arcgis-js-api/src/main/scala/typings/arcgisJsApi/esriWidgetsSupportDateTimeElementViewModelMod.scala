package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.DateTimeElementViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportDateTimeElementViewModelMod {
  
  @JSImport("esri/widgets/support/DateTimeElementViewModel", JSImport.Namespace)
  @js.native
  open class ^ ()
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
}
