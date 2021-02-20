package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PopupTemplate
import typings.arcgisJsApi.esri.PopupTemplateConstructor
import typings.arcgisJsApi.esri.PopupTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupTemplateMod extends Shortcut {
  
  @JSImport("esri/PopupTemplate", JSImport.Namespace)
  @js.native
  val ^ : PopupTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/PopupTemplate", JSImport.Namespace)
  @js.native
  /**
    * A PopupTemplate formats and defines the content of a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html)
    */
  class Class () extends PopupTemplate {
    def this(properties: PopupTemplateProperties) = this()
  }
  
  type _To = PopupTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `popupTemplateMod.foo` */
  override def _to: PopupTemplateConstructor = ^
}
