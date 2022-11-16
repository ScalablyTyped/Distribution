package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.StopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Stop")
@js.native
/**
  * A stop respresents the start, end, or midpoint of a route in [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops) or [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)
  */
open class Stop ()
  extends StObject
     with typings.arcgisJsApi.esri.Stop {
  def this(properties: StopProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Stop {
  
  @JSGlobal("__esri.Stop")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a [Stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#fromGraphic)
    */
  inline def fromGraphic(): typings.arcgisJsApi.esri.Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.Stop]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Stop]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Stop]
}
