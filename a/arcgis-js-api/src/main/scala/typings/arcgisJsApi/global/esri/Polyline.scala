package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolylineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Polyline")
@js.native
/**
  * A polyline contains an array of [paths](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths) and [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#spatialReference).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
  */
open class Polyline ()
  extends StObject
     with typings.arcgisJsApi.esri.Polyline {
  def this(properties: PolylineProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Polyline {
  
  @JSGlobal("__esri.Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polyline]
}
