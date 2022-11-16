package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeneralizeParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeneralizeParameters")
@js.native
/**
  * Sets the geometries, maximum deviation and units for the [generalize](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#generalize) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html)
  */
open class GeneralizeParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.GeneralizeParameters {
  def this(properties: GeneralizeParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GeneralizeParameters {
  
  @JSGlobal("__esri.GeneralizeParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GeneralizeParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GeneralizeParameters]
}
