package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Circle
import typings.arcgisJsApi.esri.CircleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometryCircleMod {
  
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  /**
  		 * A circle is a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) created by specifying a [center point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center) and a [radius](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html)
  		 */
  open class ^ ()
    extends StObject
       with Circle {
    def this(properties: CircleProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Circle]
}
