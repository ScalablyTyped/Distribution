package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LayerFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LayerFloorInfo")
@js.native
/**
		 * LayerFloorInfo contains properties that allow a layer to be floor-aware.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LayerFloorInfo.html)
		 */
open class LayerFloorInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.LayerFloorInfo {
  def this(properties: LayerFloorInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object LayerFloorInfo {
  
  @JSGlobal("__esri.LayerFloorInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LayerFloorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LayerFloorInfo]
}
