package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchViewModel
import typings.arcgisJsApi.esri.SearchViewModelConstructor
import typings.arcgisJsApi.esri.SearchViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchViewModel", JSImport.Namespace)
  @js.native
  val ^ : SearchViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchViewModel", JSImport.Namespace)
  @js.native
  class Class () extends SearchViewModel {
    def this(properties: SearchViewModelProperties) = this()
  }
  
  type _To = SearchViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchViewModelMod.foo` */
  override def _to: SearchViewModelConstructor = ^
}
