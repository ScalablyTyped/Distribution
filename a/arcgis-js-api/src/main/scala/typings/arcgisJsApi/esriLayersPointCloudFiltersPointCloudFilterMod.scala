package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointCloudFilter
import typings.arcgisJsApi.esri.PointCloudFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersPointCloudFiltersPointCloudFilterMod {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  /**
  		 * Point cloud filters are used to hide points that do not satisfy the filter criteria.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
  		 */
  open class ^ ()
    extends StObject
       with PointCloudFilter {
    def this(properties: PointCloudFilterProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PointCloudFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PointCloudFilter]
}
