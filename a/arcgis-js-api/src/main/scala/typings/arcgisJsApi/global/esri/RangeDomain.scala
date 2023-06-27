package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RangeDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RangeDomain")
@js.native
/**
		 * Range domains specify a valid [minimum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue) and [maximum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue) valid value that can be stored in numeric and date [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html)
		 */
open class RangeDomain ()
  extends StObject
     with typings.arcgisJsApi.esri.RangeDomain {
  def this(properties: RangeDomainProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RangeDomain {
  
  @JSGlobal("__esri.RangeDomain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RangeDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RangeDomain]
}
