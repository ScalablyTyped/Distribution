package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RouteParameters
import typings.arcgisJsApi.esri.RouteParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportRouteParametersMod {
  
  @JSImport("esri/rest/support/RouteParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html)
    */
  open class ^ ()
    extends StObject
       with RouteParameters {
    def this(properties: RouteParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/RouteParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RouteParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RouteParameters]
}
