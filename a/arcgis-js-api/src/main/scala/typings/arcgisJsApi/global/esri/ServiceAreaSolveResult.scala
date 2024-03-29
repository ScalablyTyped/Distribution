package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ServiceAreaSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ServiceAreaSolveResult")
@js.native
/**
		 * The result from [serviceArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html)
		 */
open class ServiceAreaSolveResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ServiceAreaSolveResult {
  def this(properties: ServiceAreaSolveResultProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ServiceAreaSolveResult {
  
  @JSGlobal("__esri.ServiceAreaSolveResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ServiceAreaSolveResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ServiceAreaSolveResult]
}
