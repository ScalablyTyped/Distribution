package typings.arcgisJsApi

import typings.arcgisJsApi.esri.NetworkUrl
import typings.arcgisJsApi.esri.NetworkUrlProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportNetworkUrlMod {
  
  @JSImport("esri/rest/support/NetworkUrl", JSImport.Namespace)
  @js.native
  /**
  		 * An input type for Route, Closest Facility, and Service Area solvers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkUrl.html)
  		 */
  open class ^ ()
    extends StObject
       with NetworkUrl {
    def this(properties: NetworkUrlProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/NetworkUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): NetworkUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[NetworkUrl]
}
