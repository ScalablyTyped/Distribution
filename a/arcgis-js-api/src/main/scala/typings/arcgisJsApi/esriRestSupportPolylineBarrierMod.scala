package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.PolylineBarrier
import typings.arcgisJsApi.esri.PolylineBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportPolylineBarrierMod {
  
  @JSImport("esri/rest/support/PolylineBarrier", JSImport.Namespace)
  @js.native
  /**
  		 * A polyline barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html)
  		 */
  open class ^ ()
    extends StObject
       with PolylineBarrier {
    def this(properties: PolylineBarrierProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/PolylineBarrier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [PolylineBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html#fromGraphic)
  		 */
  inline def fromGraphic(): PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[PolylineBarrier]
  inline def fromGraphic(graphic: Graphic): PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[PolylineBarrier]
  
  inline def fromJSON(json: Any): PolylineBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PolylineBarrier]
}
