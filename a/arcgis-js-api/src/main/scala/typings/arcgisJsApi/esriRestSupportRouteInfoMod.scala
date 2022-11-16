package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.RouteInfo
import typings.arcgisJsApi.esri.RouteInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportRouteInfoMod {
  
  @JSImport("esri/rest/support/RouteInfo", JSImport.Namespace)
  @js.native
  /**
    * A RouteInfo contains information about a solved route including the routes geometry and overall distance and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html)
    */
  open class ^ ()
    extends StObject
       with RouteInfo {
    def this(properties: RouteInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/RouteInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a [RouteInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#fromGraphic)
    */
  inline def fromGraphic(): RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[RouteInfo]
  inline def fromGraphic(graphic: Graphic): RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[RouteInfo]
  
  inline def fromJSON(json: Any): RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RouteInfo]
}
