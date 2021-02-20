package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Font
import typings.arcgisJsApi.esri.FontConstructor
import typings.arcgisJsApi.esri.FontProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontMod extends Shortcut {
  
  @JSImport("esri/symbols/Font", JSImport.Namespace)
  @js.native
  val ^ : FontConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/Font", JSImport.Namespace)
  @js.native
  class Class () extends Font {
    def this(properties: FontProperties) = this()
  }
  
  type _To = FontConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fontMod.foo` */
  override def _to: FontConstructor = ^
}
