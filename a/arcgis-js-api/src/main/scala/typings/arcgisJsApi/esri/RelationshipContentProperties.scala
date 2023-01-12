package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Describes the relationship's content in detail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric value indicating the maximum number of related features to display in the list of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#displayCount)
    */
  var displayCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A string value indicating how to display related records within the relationship content.
    *
    * @default "list"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#displayType)
    */
  var displayType: js.UndefOr[list] = js.undefined
  
  /**
    * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) indicating the display order for the related records, and whether they should be sorted in ascending `asc` or descending `desc` order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[RelatedRecordsInfoFieldOrderProperties]] = js.undefined
  
  /**
    * The numeric id value for the defined relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#relationshipId)
    */
  var relationshipId: js.UndefOr[Double] = js.undefined
  
  /**
    * A heading indicating what the relationship's content represents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object RelationshipContentProperties {
  
  inline def apply(): RelationshipContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipContentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipContentProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayCount(value: Double): Self = StObject.set(x, "displayCount", value.asInstanceOf[js.Any])
    
    inline def setDisplayCountUndefined: Self = StObject.set(x, "displayCount", js.undefined)
    
    inline def setDisplayType(value: list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setOrderByFields(value: js.Array[RelatedRecordsInfoFieldOrderProperties]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: RelatedRecordsInfoFieldOrderProperties*): Self = StObject.set(x, "orderByFields", js.Array(value*))
    
    inline def setRelationshipId(value: Double): Self = StObject.set(x, "relationshipId", value.asInstanceOf[js.Any])
    
    inline def setRelationshipIdUndefined: Self = StObject.set(x, "relationshipId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
