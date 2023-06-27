package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalGroup
import typings.arcgisJsApi.esri.PortalGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalGroupMod {
  
  @JSImport("esri/portal/PortalGroup", JSImport.Namespace)
  @js.native
  /**
  		 * The group resource represents a group within the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html)
  		 */
  open class ^ ()
    extends StObject
       with PortalGroup {
    def this(properties: PortalGroupProperties) = this()
  }
}
