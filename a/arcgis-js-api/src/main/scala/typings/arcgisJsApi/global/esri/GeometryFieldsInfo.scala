package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeometryFieldsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeometryFieldsInfo")
@js.native
/**
  * The `GeometryFieldsInfo` class returns information about the system maintained geometry information associated with a specific feature in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html)
  */
open class GeometryFieldsInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.GeometryFieldsInfo {
  def this(properties: GeometryFieldsInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GeometryFieldsInfo {
  
  @JSGlobal("__esri.GeometryFieldsInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GeometryFieldsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GeometryFieldsInfo]
}
