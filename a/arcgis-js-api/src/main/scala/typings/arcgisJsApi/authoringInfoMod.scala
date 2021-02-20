package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AuthoringInfo
import typings.arcgisJsApi.esri.AuthoringInfoConstructor
import typings.arcgisJsApi.esri.AuthoringInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authoringInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AuthoringInfo", JSImport.Namespace)
  @js.native
  val ^ : AuthoringInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AuthoringInfo", JSImport.Namespace)
  @js.native
  class Class () extends AuthoringInfo {
    def this(properties: AuthoringInfoProperties) = this()
  }
  
  type _To = AuthoringInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `authoringInfoMod.foo` */
  override def _to: AuthoringInfoConstructor = ^
}
