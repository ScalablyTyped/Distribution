package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DataLayer
import typings.arcgisJsApi.esri.DataLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportDataLayerMod {
  
  @JSImport("esri/rest/support/DataLayer", JSImport.Namespace)
  @js.native
  /**
  		 * Input for properties of ClosestFacilityParameters, RouteParameters or ServiceAreaParameters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with DataLayer {
    def this(properties: DataLayerProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/DataLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): DataLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DataLayer]
}
