package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Popup
import typings.arcgisJsApi.esri.PopupConstructor
import typings.arcgisJsApi.esri.PopupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  @JSImport("esri/widgets/Popup", JSImport.Namespace)
  @js.native
  val ^ : PopupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Popup", JSImport.Namespace)
  @js.native
  /**
    * The popup widget allows users to view content from feature attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    */
  class Class () extends Popup {
    def this(properties: PopupProperties) = this()
  }
  
  type _To = PopupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `popupMod.foo` */
  override def _to: PopupConstructor = ^
}
