package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FacilityLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FacilityLayerInfo")
@js.native
/**
  * The FacilityLayerInfo describes the footprints of managed buildings and other structures.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html)
  */
open class FacilityLayerInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.FacilityLayerInfo {
  def this(properties: FacilityLayerInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FacilityLayerInfo {
  
  @JSGlobal("__esri.FacilityLayerInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FacilityLayerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FacilityLayerInfo]
}
