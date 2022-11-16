package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointCloudReturnFilter
import typings.arcgisJsApi.esri.PointCloudReturnFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersPointCloudFiltersPointCloudReturnFilterMod {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  /**
    * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
    */
  open class ^ ()
    extends StObject
       with PointCloudReturnFilter {
    def this(properties: PointCloudReturnFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PointCloudReturnFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PointCloudReturnFilter]
}
