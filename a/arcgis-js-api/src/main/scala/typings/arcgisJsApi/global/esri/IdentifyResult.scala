package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.IdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.IdentifyResult")
@js.native
/**
		 * The result from [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyResult.html)
		 */
open class IdentifyResult ()
  extends StObject
     with typings.arcgisJsApi.esri.IdentifyResult {
  def this(properties: IdentifyResultProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object IdentifyResult {
  
  @JSGlobal("__esri.IdentifyResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.IdentifyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.IdentifyResult]
}
