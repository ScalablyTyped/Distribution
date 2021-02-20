package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.View
import typings.arcgisJsApi.esri.ViewConstructor
import typings.arcgisJsApi.esri.ViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod extends Shortcut {
  
  @JSImport("esri/views/View", JSImport.Namespace)
  @js.native
  val ^ : ViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/View", JSImport.Namespace)
  @js.native
  /**
    * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
    */
  class Class () extends View {
    def this(properties: ViewProperties) = this()
  }
  
  type _To = ViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewMod.foo` */
  override def _to: ViewConstructor = ^
}
