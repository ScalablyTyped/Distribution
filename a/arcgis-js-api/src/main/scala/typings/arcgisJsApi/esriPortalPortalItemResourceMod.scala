package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalItemResource
import typings.arcgisJsApi.esri.PortalItemResourceConstructor
import typings.arcgisJsApi.esri.PortalItemResourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalItemResourceMod extends Shortcut {
  
  @JSImport("esri/portal/PortalItemResource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalItemResourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalItemResource", JSImport.Namespace)
  @js.native
  /**
    * A reference to a portal item resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html)
    */
  open class Class ()
    extends StObject
       with PortalItemResource {
    def this(properties: PortalItemResourceProperties) = this()
  }
  
  type _To = js.Object & PortalItemResourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalItemResourceMod.foo` */
  override def _to: js.Object & PortalItemResourceConstructor = ^
}
