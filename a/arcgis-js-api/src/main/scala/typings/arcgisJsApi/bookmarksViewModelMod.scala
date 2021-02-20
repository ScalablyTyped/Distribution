package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BookmarksViewModel
import typings.arcgisJsApi.esri.BookmarksViewModelConstructor
import typings.arcgisJsApi.esri.BookmarksViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarksViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Bookmarks/BookmarksViewModel", JSImport.Namespace)
  @js.native
  val ^ : BookmarksViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Bookmarks/BookmarksViewModel", JSImport.Namespace)
  @js.native
  class Class () extends BookmarksViewModel {
    def this(properties: BookmarksViewModelProperties) = this()
  }
  
  type _To = BookmarksViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bookmarksViewModelMod.foo` */
  override def _to: BookmarksViewModelConstructor = ^
}
