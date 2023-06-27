package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ServerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ServerInfo")
@js.native
/**
		 * This class contains information about an ArcGIS Server and its token endpoint.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html)
		 */
open class ServerInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.ServerInfo {
  def this(properties: ServerInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ServerInfo {
  
  @JSGlobal("__esri.ServerInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ServerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ServerInfo]
}
