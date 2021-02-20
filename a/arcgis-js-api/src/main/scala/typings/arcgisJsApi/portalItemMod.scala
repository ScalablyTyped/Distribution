package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.PortalItemConstructor
import typings.arcgisJsApi.esri.PortalItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalItemMod extends Shortcut {
  
  @JSImport("esri/portal/PortalItem", JSImport.Namespace)
  @js.native
  val ^ : PortalItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalItem", JSImport.Namespace)
  @js.native
  class Class () extends PortalItem {
    def this(properties: PortalItemProperties) = this()
  }
  
  type _To = PortalItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalItemMod.foo` */
  override def _to: PortalItemConstructor = ^
}
