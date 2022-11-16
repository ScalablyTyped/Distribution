package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TravelMode
import typings.arcgisJsApi.esri.TravelModeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportTravelModeMod {
  
  @JSImport("esri/rest/support/TravelMode", JSImport.Namespace)
  @js.native
  /**
    * A TravelMode is a set of characteristics that define how an object like a vehicle, bicycle, or pedestrian moves along a street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html)
    */
  open class ^ ()
    extends StObject
       with TravelMode {
    def this(properties: TravelModeProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/TravelMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TravelMode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TravelMode]
}
