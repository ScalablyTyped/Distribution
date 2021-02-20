package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalQueryResult
import typings.arcgisJsApi.esri.PortalQueryResultConstructor
import typings.arcgisJsApi.esri.PortalQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalQueryResultMod extends Shortcut {
  
  @JSImport("esri/portal/PortalQueryResult", JSImport.Namespace)
  @js.native
  val ^ : PortalQueryResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalQueryResult", JSImport.Namespace)
  @js.native
  class Class () extends PortalQueryResult {
    def this(properties: PortalQueryResultProperties) = this()
  }
  
  type _To = PortalQueryResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalQueryResultMod.foo` */
  override def _to: PortalQueryResultConstructor = ^
}
