package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DirectionsEvent
import typings.arcgisJsApi.esri.DirectionsEventProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportDirectionsEventMod {
  
  @JSImport("esri/rest/support/DirectionsEvent", JSImport.Namespace)
  @js.native
  /**
  		 * DirectionsEvent represent [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#events) for features in a [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html)
  		 */
  open class ^ ()
    extends StObject
       with DirectionsEvent {
    def this(properties: DirectionsEventProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/DirectionsEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): DirectionsEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DirectionsEvent]
}
