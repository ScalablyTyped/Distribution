package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchSource
import typings.arcgisJsApi.esri.SearchSourceConstructor
import typings.arcgisJsApi.esri.SearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  val ^ : SearchSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  class Class () extends SearchSource {
    def this(properties: SearchSourceProperties) = this()
  }
  
  type _To = SearchSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchSourceMod.foo` */
  override def _to: SearchSourceConstructor = ^
}
