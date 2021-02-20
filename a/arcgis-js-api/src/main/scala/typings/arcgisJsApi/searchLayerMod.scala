package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchLayer
import typings.arcgisJsApi.esri.SearchLayerConstructor
import typings.arcgisJsApi.esri.SearchLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchLayerMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchLayer", JSImport.Namespace)
  @js.native
  val ^ : SearchLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchLayer", JSImport.Namespace)
  @js.native
  class Class () extends SearchLayer {
    def this(properties: SearchLayerProperties) = this()
  }
  
  type _To = SearchLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchLayerMod.foo` */
  override def _to: SearchLayerConstructor = ^
}
