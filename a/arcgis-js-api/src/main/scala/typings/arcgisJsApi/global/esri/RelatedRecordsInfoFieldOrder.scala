package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RelatedRecordsInfoFieldOrder")
@js.native
/**
		 * The `RelatedRecordsInfoFieldOrder` class indicates the field display order for the related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html)
		 */
open class RelatedRecordsInfoFieldOrder ()
  extends StObject
     with typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder {
  def this(properties: RelatedRecordsInfoFieldOrderProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RelatedRecordsInfoFieldOrder {
  
  @JSGlobal("__esri.RelatedRecordsInfoFieldOrder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder]
}
