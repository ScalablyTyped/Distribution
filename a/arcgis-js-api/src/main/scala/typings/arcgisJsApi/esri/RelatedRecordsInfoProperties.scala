package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedRecordsInfoProperties extends StObject {
  
  /**
    * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[RelatedRecordsInfoFieldOrderProperties]] = js.undefined
  
  /**
    * Indicates whether to display related records in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#showRelatedRecords)
    */
  var showRelatedRecords: js.UndefOr[Boolean] = js.undefined
}
object RelatedRecordsInfoProperties {
  
  inline def apply(): RelatedRecordsInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedRecordsInfoProperties]
  }
  
  extension [Self <: RelatedRecordsInfoProperties](x: Self) {
    
    inline def setOrderByFields(value: js.Array[RelatedRecordsInfoFieldOrderProperties]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: RelatedRecordsInfoFieldOrderProperties*): Self = StObject.set(x, "orderByFields", js.Array(value*))
    
    inline def setShowRelatedRecords(value: Boolean): Self = StObject.set(x, "showRelatedRecords", value.asInstanceOf[js.Any])
    
    inline def setShowRelatedRecordsUndefined: Self = StObject.set(x, "showRelatedRecords", js.undefined)
  }
}
