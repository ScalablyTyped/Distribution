package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolygonBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PolygonBarrier")
@js.native
/**
  * A polygon barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html)
  */
open class PolygonBarrier ()
  extends StObject
     with typings.arcgisJsApi.esri.PolygonBarrier {
  def this(properties: PolygonBarrierProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PolygonBarrier {
  
  @JSGlobal("__esri.PolygonBarrier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a [PolygonBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#fromGraphic)
    */
  inline def fromGraphic(): typings.arcgisJsApi.esri.PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.PolygonBarrier]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PolygonBarrier]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PolygonBarrier]
}
