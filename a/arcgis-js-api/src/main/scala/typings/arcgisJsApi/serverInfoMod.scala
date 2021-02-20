package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ServerInfo
import typings.arcgisJsApi.esri.ServerInfoConstructor
import typings.arcgisJsApi.esri.ServerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverInfoMod extends Shortcut {
  
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  val ^ : ServerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  class Class () extends ServerInfo {
    def this(properties: ServerInfoProperties) = this()
  }
  
  type _To = ServerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `serverInfoMod.foo` */
  override def _to: ServerInfoConstructor = ^
}
