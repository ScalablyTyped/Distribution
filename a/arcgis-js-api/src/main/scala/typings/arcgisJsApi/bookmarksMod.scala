package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Bookmarks
import typings.arcgisJsApi.esri.BookmarksConstructor
import typings.arcgisJsApi.esri.BookmarksProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarksMod extends Shortcut {
  
  @JSImport("esri/widgets/Bookmarks", JSImport.Namespace)
  @js.native
  val ^ : BookmarksConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Bookmarks", JSImport.Namespace)
  @js.native
  /**
    * The Bookmarks widget allows end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html)
    */
  class Class () extends Bookmarks {
    def this(properties: BookmarksProperties) = this()
  }
  
  type _To = BookmarksConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bookmarksMod.foo` */
  override def _to: BookmarksConstructor = ^
}
