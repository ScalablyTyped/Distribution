package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalUser
import typings.arcgisJsApi.esri.PortalUserProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalUserMod {
  
  @JSImport("esri/portal/PortalUser", JSImport.Namespace)
  @js.native
  /**
    * Represents a registered user of the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html)
    */
  open class ^ ()
    extends StObject
       with PortalUser {
    def this(properties: PortalUserProperties) = this()
  }
}
