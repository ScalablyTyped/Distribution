package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ActionButton
import typings.arcgisJsApi.esri.ActionButtonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSupportActionsActionButtonMod {
  
  @JSImport("esri/support/actions/ActionButton", JSImport.Namespace)
  @js.native
  /**
    * A customizable button that performs a specific action(s) used in widgets such as the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html), [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html), and [BasemapLayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html)
    */
  open class ^ ()
    extends StObject
       with ActionButton {
    def this(properties: ActionButtonProperties) = this()
  }
}
