package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudValueFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PointCloudValueFilter")
@js.native
/**
		 * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
		 */
open class PointCloudValueFilter ()
  extends StObject
     with typings.arcgisJsApi.esri.PointCloudValueFilter {
  def this(properties: PointCloudValueFilterProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PointCloudValueFilter {
  
  @JSGlobal("__esri.PointCloudValueFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudValueFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudValueFilter]
}
