package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.PolygonBarrier
import typings.arcgisJsApi.esri.PolygonBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportPolygonBarrierMod {
  
  @JSImport("esri/rest/support/PolygonBarrier", JSImport.Namespace)
  @js.native
  /**
  		 * A polygon barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html)
  		 */
  open class ^ ()
    extends StObject
       with PolygonBarrier {
    def this(properties: PolygonBarrierProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/PolygonBarrier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [PolygonBarrier](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html#fromGraphic)
  		 */
  inline def fromGraphic(): PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[PolygonBarrier]
  inline def fromGraphic(graphic: Graphic): PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[PolygonBarrier]
  
  inline def fromJSON(json: Any): PolygonBarrier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PolygonBarrier]
}
