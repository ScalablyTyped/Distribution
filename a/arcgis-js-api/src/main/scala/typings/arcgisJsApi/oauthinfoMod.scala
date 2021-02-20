package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OAuthInfo
import typings.arcgisJsApi.esri.OAuthInfoConstructor
import typings.arcgisJsApi.esri.OAuthInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauthinfoMod extends Shortcut {
  
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  val ^ : OAuthInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  class Class () extends OAuthInfo {
    def this(properties: OAuthInfoProperties) = this()
  }
  
  type _To = OAuthInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `oauthinfoMod.foo` */
  override def _to: OAuthInfoConstructor = ^
}
