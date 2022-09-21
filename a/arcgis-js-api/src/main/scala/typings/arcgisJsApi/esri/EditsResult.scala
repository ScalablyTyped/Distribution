package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditsResult
  extends StObject
     with Object {
  
  /**
    * Result of adding attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var addAttachmentResults: js.Array[FeatureEditResult]
  
  /**
    * Result of adding features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var addFeatureResults: js.Array[FeatureEditResult]
  
  /**
    * Result of deleting attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var deleteAttachmentResults: js.Array[FeatureEditResult]
  
  /**
    * Result of deleting features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var deleteFeatureResults: js.Array[FeatureEditResult]
  
  /**
    * The time edits were applied to the feature service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var editMoment: js.UndefOr[Double] = js.undefined
  
  /**
    * Edited features as result of editing a feature that participates in composite relationships in a database.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var editedFeatureResults: js.UndefOr[js.Array[EditedFeatureResult]] = js.undefined
  
  /**
    * Result of updating attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var updateAttachmentResults: js.Array[FeatureEditResult]
  
  /**
    * Result of updating features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditsResult)
    */
  var updateFeatureResults: js.Array[FeatureEditResult]
}
object EditsResult {
  
  inline def apply(
    addAttachmentResults: js.Array[FeatureEditResult],
    addFeatureResults: js.Array[FeatureEditResult],
    constructor: js.Function,
    deleteAttachmentResults: js.Array[FeatureEditResult],
    deleteFeatureResults: js.Array[FeatureEditResult],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    updateAttachmentResults: js.Array[FeatureEditResult],
    updateFeatureResults: js.Array[FeatureEditResult]
  ): EditsResult = {
    val __obj = js.Dynamic.literal(addAttachmentResults = addAttachmentResults.asInstanceOf[js.Any], addFeatureResults = addFeatureResults.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], deleteAttachmentResults = deleteAttachmentResults.asInstanceOf[js.Any], deleteFeatureResults = deleteFeatureResults.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), updateAttachmentResults = updateAttachmentResults.asInstanceOf[js.Any], updateFeatureResults = updateFeatureResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditsResult]
  }
  
  extension [Self <: EditsResult](x: Self) {
    
    inline def setAddAttachmentResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addAttachmentResults", value.asInstanceOf[js.Any])
    
    inline def setAddAttachmentResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addAttachmentResults", js.Array(value*))
    
    inline def setAddFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setAddFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addFeatureResults", js.Array(value*))
    
    inline def setDeleteAttachmentResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deleteAttachmentResults", value.asInstanceOf[js.Any])
    
    inline def setDeleteAttachmentResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deleteAttachmentResults", js.Array(value*))
    
    inline def setDeleteFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deleteFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setDeleteFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deleteFeatureResults", js.Array(value*))
    
    inline def setEditMoment(value: Double): Self = StObject.set(x, "editMoment", value.asInstanceOf[js.Any])
    
    inline def setEditMomentUndefined: Self = StObject.set(x, "editMoment", js.undefined)
    
    inline def setEditedFeatureResults(value: js.Array[EditedFeatureResult]): Self = StObject.set(x, "editedFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setEditedFeatureResultsUndefined: Self = StObject.set(x, "editedFeatureResults", js.undefined)
    
    inline def setEditedFeatureResultsVarargs(value: EditedFeatureResult*): Self = StObject.set(x, "editedFeatureResults", js.Array(value*))
    
    inline def setUpdateAttachmentResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updateAttachmentResults", value.asInstanceOf[js.Any])
    
    inline def setUpdateAttachmentResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updateAttachmentResults", js.Array(value*))
    
    inline def setUpdateFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updateFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setUpdateFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updateFeatureResults", js.Array(value*))
  }
}
