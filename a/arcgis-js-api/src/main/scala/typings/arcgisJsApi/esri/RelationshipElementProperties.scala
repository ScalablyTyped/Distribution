package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipElementProperties
  extends StObject
     with ElementProperties {
  
  /**
  		 * A numeric value indicating the maximum number of related features to display in the list of related records.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#displayCount)
  		 */
  var displayCount: js.UndefOr[String] = js.undefined
  
  /**
  		 * A string value indicating how to display related records within the relationship content.
  		 *
  		 * @default list
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#displayType)
  		 */
  var displayType: js.UndefOr[list] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FormTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#editableExpression)
  		 */
  var editableExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#orderByFields)
  		 */
  var orderByFields: js.UndefOr[js.Array[RelatedRecordsInfoFieldOrderProperties]] = js.undefined
}
object RelationshipElementProperties {
  
  inline def apply(): RelationshipElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipElementProperties] (val x: Self) extends AnyVal {
    
    inline def setDisplayCount(value: String): Self = StObject.set(x, "displayCount", value.asInstanceOf[js.Any])
    
    inline def setDisplayCountUndefined: Self = StObject.set(x, "displayCount", js.undefined)
    
    inline def setDisplayType(value: list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setEditableExpression(value: String): Self = StObject.set(x, "editableExpression", value.asInstanceOf[js.Any])
    
    inline def setEditableExpressionUndefined: Self = StObject.set(x, "editableExpression", js.undefined)
    
    inline def setOrderByFields(value: js.Array[RelatedRecordsInfoFieldOrderProperties]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: RelatedRecordsInfoFieldOrderProperties*): Self = StObject.set(x, "orderByFields", js.Array(value*))
  }
}
