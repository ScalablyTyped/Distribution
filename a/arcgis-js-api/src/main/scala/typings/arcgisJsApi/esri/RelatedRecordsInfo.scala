package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedRecordsInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#orderByFields)
  		 */
  var orderByFields: js.Array[RelatedRecordsInfoFieldOrder] = js.native
  
  /**
  		 * Indicates whether to display related records in the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#showRelatedRecords)
  		 */
  var showRelatedRecords: Boolean = js.native
}
