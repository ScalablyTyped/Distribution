package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalFolder
import typings.arcgisJsApi.esri.PortalFolderConstructor
import typings.arcgisJsApi.esri.PortalFolderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalFolderMod extends Shortcut {
  
  @JSImport("esri/portal/PortalFolder", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalFolderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalFolder", JSImport.Namespace)
  @js.native
  /**
    * Provides information about folders used to organize content in a portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html)
    */
  open class Class ()
    extends StObject
       with PortalFolder {
    def this(properties: PortalFolderProperties) = this()
  }
  
  type _To = js.Object & PortalFolderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalFolderMod.foo` */
  override def _to: js.Object & PortalFolderConstructor = ^
}
