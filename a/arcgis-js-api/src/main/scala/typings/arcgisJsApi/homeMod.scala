package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Home
import typings.arcgisJsApi.esri.HomeConstructor
import typings.arcgisJsApi.esri.HomeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeMod extends Shortcut {
  
  @JSImport("esri/widgets/Home", JSImport.Namespace)
  @js.native
  val ^ : HomeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Home", JSImport.Namespace)
  @js.native
  /**
    * Provides a simple widget that switches the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to its initial [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or a previously defined [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html)
    */
  class Class () extends Home {
    def this(properties: HomeProperties) = this()
  }
  
  type _To = HomeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `homeMod.foo` */
  override def _to: HomeConstructor = ^
}
