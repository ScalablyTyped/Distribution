package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Locate
import typings.arcgisJsApi.esri.LocateConstructor
import typings.arcgisJsApi.esri.LocateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locateMod extends Shortcut {
  
  @JSImport("esri/widgets/Locate", JSImport.Namespace)
  @js.native
  val ^ : LocateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Locate", JSImport.Namespace)
  @js.native
  /**
    * Provides a simple widget that animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html)
    */
  class Class () extends Locate {
    def this(properties: LocateProperties) = this()
  }
  
  type _To = LocateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `locateMod.foo` */
  override def _to: LocateConstructor = ^
}
