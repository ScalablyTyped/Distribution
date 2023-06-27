package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipInput
  extends StObject
     with Accessor
     with EditableInput {
  
  /**
  		 * A numeric value indicating the maximum number of related features to display in the list of related records.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#displayCount)
  		 */
  val displayCount: String = js.native
  
  /**
  		 * A string value indicating how to display related records within the relationship content.
  		 *
  		 * @default "list"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#displayType)
  		 */
  val displayType: list = js.native
  
  /**
  		 * Indicates whether the input is editable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#editable)
  		 */
  val editable: Boolean = js.native
  
  /**
  		 * The group containing the relationship input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#group)
  		 */
  val group: GroupInput = js.native
  
  /**
  		 * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#orderByFields)
  		 */
  val orderByFields: js.Array[RelatedRecordsInfoFieldOrder] = js.native
  
  /**
  		 * The type of input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#type)
  		 */
  val `type`: typings.arcgisJsApi.arcgisJsApiStrings.relationship = js.native
  
  /**
  		 * Indicates whether the form is currently updating.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-RelationshipInput.html#updating)
  		 */
  val updating: Boolean = js.native
}
