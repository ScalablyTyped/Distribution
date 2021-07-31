package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UI
import typings.arcgisJsApi.esri.UIConstructor
import typings.arcgisJsApi.esri.UIProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod extends Shortcut {
  
  @JSImport("esri/views/ui/UI", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/ui/UI", JSImport.Namespace)
  @js.native
  /**
    * This class provides a simple interface for [adding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add), [moving](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move) and [removing](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove) components from a view's user interface (UI).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html)
    */
  class Class ()
    extends StObject
       with UI {
    def this(properties: UIProperties) = this()
  }
  
  type _To = js.Object & UIConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uIMod.foo` */
  override def _to: js.Object & UIConstructor = ^
}
