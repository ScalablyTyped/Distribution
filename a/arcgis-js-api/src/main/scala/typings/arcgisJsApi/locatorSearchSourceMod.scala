package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocatorSearchSource
import typings.arcgisJsApi.esri.LocatorSearchSourceConstructor
import typings.arcgisJsApi.esri.LocatorSearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locatorSearchSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  val ^ : LocatorSearchSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  class Class () extends LocatorSearchSource {
    def this(properties: LocatorSearchSourceProperties) = this()
  }
  
  type _To = LocatorSearchSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `locatorSearchSourceMod.foo` */
  override def _to: LocatorSearchSourceConstructor = ^
}
