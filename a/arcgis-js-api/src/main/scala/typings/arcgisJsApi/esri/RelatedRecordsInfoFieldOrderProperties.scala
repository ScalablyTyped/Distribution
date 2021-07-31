package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedRecordsInfoFieldOrderProperties extends StObject {
  
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Set the ascending or descending sort order of the returned related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#order)
    */
  var order: js.UndefOr[asc_ | desc_] = js.undefined
}
object RelatedRecordsInfoFieldOrderProperties {
  
  @scala.inline
  def apply(): RelatedRecordsInfoFieldOrderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedRecordsInfoFieldOrderProperties]
  }
  
  @scala.inline
  implicit class RelatedRecordsInfoFieldOrderPropertiesMutableBuilder[Self <: RelatedRecordsInfoFieldOrderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOrder(value: asc_ | desc_): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
