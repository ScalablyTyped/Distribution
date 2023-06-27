package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TravelModeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TravelMode")
@js.native
/**
		 * A TravelMode is a set of characteristics that define how an object like a vehicle, bicycle, or pedestrian moves along a street network.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html)
		 */
open class TravelMode ()
  extends StObject
     with typings.arcgisJsApi.esri.TravelMode {
  def this(properties: TravelModeProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TravelMode {
  
  @JSGlobal("__esri.TravelMode")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TravelMode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TravelMode]
}
