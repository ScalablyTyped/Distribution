package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LevelLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LevelLayerInfo")
@js.native
/**
  * The LevelLayerInfo class describes the footprint of each occupiable floor contained in a managed facility.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html)
  */
open class LevelLayerInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.LevelLayerInfo {
  def this(properties: LevelLayerInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object LevelLayerInfo {
  
  @JSGlobal("__esri.LevelLayerInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LevelLayerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LevelLayerInfo]
}
