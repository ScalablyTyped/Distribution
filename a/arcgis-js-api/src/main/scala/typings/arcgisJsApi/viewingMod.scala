package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Viewing
import typings.arcgisJsApi.esri.ViewingConstructor
import typings.arcgisJsApi.esri.ViewingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewingMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/Viewing", JSImport.Namespace)
  @js.native
  val ^ : ViewingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/Viewing", JSImport.Namespace)
  @js.native
  class Class () extends Viewing {
    def this(properties: ViewingProperties) = this()
  }
  
  type _To = ViewingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewingMod.foo` */
  override def _to: ViewingConstructor = ^
}
