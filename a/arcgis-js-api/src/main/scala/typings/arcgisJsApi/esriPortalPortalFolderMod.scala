package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalFolder
import typings.arcgisJsApi.esri.PortalFolderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalFolderMod {
  
  @JSImport("esri/portal/PortalFolder", JSImport.Namespace)
  @js.native
  /**
    * Provides information about folders used to organize content in a portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html)
    */
  open class ^ ()
    extends StObject
       with PortalFolder {
    def this(properties: PortalFolderProperties) = this()
  }
}
