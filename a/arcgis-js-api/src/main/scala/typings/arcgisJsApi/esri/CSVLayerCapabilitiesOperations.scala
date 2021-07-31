package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerCapabilitiesOperations
  extends StObject
     with Object {
  
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsAdd: Boolean
  
  /**
    * Indicates if values of one or more field values in the layer can be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsCalculate: Boolean
  
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDelete: Boolean
  
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsEditing: Boolean
  
  /**
    * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuery: Boolean
  
  /**
    * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQueryAttachments: Boolean
  
  /**
    * Indicates if resized attachments are supported in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsResizeAttachments: Boolean
  
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUpdate: Boolean
  
  /**
    * Indicates if the layer supports a SQL-92 expression or where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsValidateSql: Boolean
}
object CSVLayerCapabilitiesOperations {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdd: Boolean,
    supportsCalculate: Boolean,
    supportsDelete: Boolean,
    supportsEditing: Boolean,
    supportsQuery: Boolean,
    supportsQueryAttachments: Boolean,
    supportsResizeAttachments: Boolean,
    supportsUpdate: Boolean,
    supportsValidateSql: Boolean
  ): CSVLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdd = supportsAdd.asInstanceOf[js.Any], supportsCalculate = supportsCalculate.asInstanceOf[js.Any], supportsDelete = supportsDelete.asInstanceOf[js.Any], supportsEditing = supportsEditing.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryAttachments = supportsQueryAttachments.asInstanceOf[js.Any], supportsResizeAttachments = supportsResizeAttachments.asInstanceOf[js.Any], supportsUpdate = supportsUpdate.asInstanceOf[js.Any], supportsValidateSql = supportsValidateSql.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit class CSVLayerCapabilitiesOperationsMutableBuilder[Self <: CSVLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportsAdd(value: Boolean): Self = StObject.set(x, "supportsAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsCalculate(value: Boolean): Self = StObject.set(x, "supportsCalculate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDelete(value: Boolean): Self = StObject.set(x, "supportsDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEditing(value: Boolean): Self = StObject.set(x, "supportsEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQuery(value: Boolean): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsQueryAttachments(value: Boolean): Self = StObject.set(x, "supportsQueryAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsResizeAttachments(value: Boolean): Self = StObject.set(x, "supportsResizeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUpdate(value: Boolean): Self = StObject.set(x, "supportsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsValidateSql(value: Boolean): Self = StObject.set(x, "supportsValidateSql", value.asInstanceOf[js.Any])
  }
}
