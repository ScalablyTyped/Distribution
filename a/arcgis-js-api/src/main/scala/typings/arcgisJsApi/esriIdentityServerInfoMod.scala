package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ServerInfo
import typings.arcgisJsApi.esri.ServerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriIdentityServerInfoMod {
  
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  /**
  		 * This class contains information about an ArcGIS Server and its token endpoint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with ServerInfo {
    def this(properties: ServerInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ServerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ServerInfo]
}
