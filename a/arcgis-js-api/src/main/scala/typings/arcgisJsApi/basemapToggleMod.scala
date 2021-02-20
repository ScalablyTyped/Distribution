package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapToggle
import typings.arcgisJsApi.esri.BasemapToggleConstructor
import typings.arcgisJsApi.esri.BasemapToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapToggleMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapToggle", JSImport.Namespace)
  @js.native
  val ^ : BasemapToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapToggle", JSImport.Namespace)
  @js.native
  /**
    * The BasemapToggle provides a widget which allows an end-user to switch between two basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html)
    */
  class Class () extends BasemapToggle {
    def this(properties: BasemapToggleProperties) = this()
  }
  
  type _To = BasemapToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapToggleMod.foo` */
  override def _to: BasemapToggleConstructor = ^
}
