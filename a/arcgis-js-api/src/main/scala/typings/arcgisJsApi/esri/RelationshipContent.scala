package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
  		 * Describes the relationship's content in detail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#description)
  		 */
  var description: String = js.native
  
  /**
  		 * A numeric value indicating the maximum number of related features to display in the list of related records.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#displayCount)
  		 */
  var displayCount: Double = js.native
  
  /**
  		 * A string value indicating how to display related records within the relationship content.
  		 *
  		 * @default "list"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#displayType)
  		 */
  var displayType: list = js.native
  
  /**
  		 * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) indicating the display order for the related records, and whether they should be sorted in ascending `asc` or descending `desc` order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#orderByFields)
  		 */
  var orderByFields: js.Array[RelatedRecordsInfoFieldOrder] = js.native
  
  /**
  		 * The numeric id value for the defined relationship.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#relationshipId)
  		 */
  var relationshipId: Double = js.native
  
  /**
  		 * A heading indicating what the relationship's content represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * The type of popup element displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#type)
  		 */
  @JSName("type")
  val type_RelationshipContent: typings.arcgisJsApi.arcgisJsApiStrings.relationship = js.native
}
