package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalLayer
import typings.arcgisJsApi.esri.PortalLayerConstructor
import typings.arcgisJsApi.esri.PortalLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  val ^ : PortalLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  class Class () extends PortalLayer {
    def this(properties: PortalLayerProperties) = this()
  }
  
  type _To = PortalLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalLayerMod.foo` */
  override def _to: PortalLayerConstructor = ^
}
