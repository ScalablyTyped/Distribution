package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AggregatedGeometry
import typings.arcgisJsApi.esri.AggregatedGeometryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportAggregatedGeometryMod {
  
  @JSImport("esri/rest/networks/support/AggregatedGeometry", JSImport.Namespace)
  @js.native
  /**
    * A class that defines an aggregation of geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html)
    */
  open class ^ ()
    extends StObject
       with AggregatedGeometry {
    def this(properties: AggregatedGeometryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/AggregatedGeometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AggregatedGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AggregatedGeometry]
}
