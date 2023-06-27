package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.NetworkFromPortalItemParams
import typings.arcgisJsApi.esri.NetworkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Network")
@js.native
/**
		 * Class defining high level properties that describes utility networks and trace networks.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html)
		 */
open class Network ()
  extends StObject
     with typings.arcgisJsApi.esri.Network {
  def this(properties: NetworkProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Network {
  
  @JSGlobal("__esri.Network")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Network = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Network]
  
  /**
  		 * Creates a new network instance from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fromPortalItem)
  		 */
  inline def fromPortalItem(params: NetworkFromPortalItemParams): js.Promise[typings.arcgisJsApi.esri.UtilityNetwork] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPortalItem")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.UtilityNetwork]]
}
