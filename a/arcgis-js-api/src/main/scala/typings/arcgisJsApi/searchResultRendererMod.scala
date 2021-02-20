package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchResultRenderer
import typings.arcgisJsApi.esri.SearchResultRendererConstructor
import typings.arcgisJsApi.esri.SearchResultRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultRendererMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchResultRenderer", JSImport.Namespace)
  @js.native
  val ^ : SearchResultRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchResultRenderer", JSImport.Namespace)
  @js.native
  /**
    * The `SearchResultRenderer` renders the [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget results and allows expanding a DOM element to show alternative matches.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html)
    */
  class Class () extends SearchResultRenderer {
    def this(properties: SearchResultRendererProperties) = this()
  }
  
  type _To = SearchResultRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchResultRendererMod.foo` */
  override def _to: SearchResultRendererConstructor = ^
}
