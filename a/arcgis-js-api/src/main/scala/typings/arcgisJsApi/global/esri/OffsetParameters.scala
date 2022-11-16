package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.OffsetParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.OffsetParameters")
@js.native
/**
  * Sets the offset distance, type and other parameters for the [geometryService.offset](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#offset) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html)
  */
open class OffsetParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.OffsetParameters {
  def this(properties: OffsetParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object OffsetParameters {
  
  @JSGlobal("__esri.OffsetParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.OffsetParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.OffsetParameters]
}
