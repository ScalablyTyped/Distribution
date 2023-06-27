package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TrimExtendParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TrimExtendParameters")
@js.native
/**
		 * Used to set the parameters for the [geometryService.trimExtend](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend) operation.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html)
		 */
open class TrimExtendParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.TrimExtendParameters {
  def this(properties: TrimExtendParametersProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TrimExtendParameters {
  
  @JSGlobal("__esri.TrimExtendParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TrimExtendParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TrimExtendParameters]
}
