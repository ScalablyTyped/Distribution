package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Search
import typings.arcgisJsApi.esri.SearchConstructor
import typings.arcgisJsApi.esri.SearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/Search", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/Search", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Search {
    def this(properties: SearchProperties) = this()
  }
  
  type _To = js.Object & SearchConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchMod.foo` */
  override def _to: js.Object & SearchConstructor = ^
}
