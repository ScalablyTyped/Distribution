package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipElement
  extends StObject
     with Element {
  
  /**
  		 * A numeric value indicating the maximum number of related features to display in the list of related records.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#displayCount)
  		 */
  var displayCount: String = js.native
  
  /**
  		 * A string value indicating how to display related records within the relationship content.
  		 *
  		 * @default list
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#displayType)
  		 */
  var displayType: list = js.native
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FormTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#editableExpression)
  		 */
  var editableExpression: String = js.native
  
  /**
  		 * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#orderByFields)
  		 */
  var orderByFields: js.Array[RelatedRecordsInfoFieldOrder] = js.native
  
  /**
  		 * The numeric id value for the defined relationship.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#relationshipId)
  		 */
  val relationshipId: Double = js.native
  
  /**
  		 * Indicates the type of form [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html#type)
  		 */
  @JSName("type")
  val type_RelationshipElement: typings.arcgisJsApi.arcgisJsApiStrings.relationship = js.native
}
