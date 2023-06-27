package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.Polygon
import typings.arcgisJsApi.esri.PolygonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometryPolygonMod {
  
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  /**
  		 * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  		 */
  open class ^ ()
    extends StObject
       with Polygon {
    def this(properties: PolygonProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Converts the given Extent to a Polygon instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
  		 */
  inline def fromExtent(extent: Extent): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  
  inline def fromJSON(json: Any): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Polygon]
}
