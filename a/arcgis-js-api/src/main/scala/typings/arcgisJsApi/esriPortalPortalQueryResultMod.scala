package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalQueryResult
import typings.arcgisJsApi.esri.PortalQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalQueryResultMod {
  
  @JSImport("esri/portal/PortalQueryResult", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the result object returned from a portal query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html)
  		 */
  open class ^ ()
    extends StObject
       with PortalQueryResult {
    def this(properties: PortalQueryResultProperties) = this()
  }
}
