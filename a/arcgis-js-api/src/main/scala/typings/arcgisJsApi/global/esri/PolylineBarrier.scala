package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolylineBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PolylineBarrier")
@js.native
/**
  * A polyline barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html)
  */
open class PolylineBarrier ()
  extends StObject
     with typings.arcgisJsApi.esri.PolylineBarrier {
  def this(properties: PolylineBarrierProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PolylineBarrier {
  
  @JSGlobal("__esri.PolylineBarrier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a [PolylineBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#fromGraphic)
    */
  inline def fromGraphic(): typings.arcgisJsApi.esri.PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.PolylineBarrier]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PolylineBarrier]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PolylineBarrier]
}
