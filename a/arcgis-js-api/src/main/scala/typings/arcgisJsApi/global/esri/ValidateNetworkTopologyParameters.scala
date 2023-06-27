package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ValidateNetworkTopologyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ValidateNetworkTopologyParameters")
@js.native
/**
		 * ValidateNetworkTopologyParameters describes the optional and required parameters for validating a network topology.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html)
		 */
open class ValidateNetworkTopologyParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ValidateNetworkTopologyParameters {
  def this(properties: ValidateNetworkTopologyParametersProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ValidateNetworkTopologyParameters {
  
  @JSGlobal("__esri.ValidateNetworkTopologyParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ValidateNetworkTopologyParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ValidateNetworkTopologyParameters]
}
