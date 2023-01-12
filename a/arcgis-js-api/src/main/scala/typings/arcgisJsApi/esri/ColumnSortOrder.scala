package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortOrder extends StObject {
  
  /**
    * Controls the sort order of the column given the set `fieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#ColumnSortOrder)
    */
  var direction: asc_ | desc_ | Null
  
  /**
    * The field name as defined by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#ColumnSortOrder)
    */
  var fieldName: String
}
object ColumnSortOrder {
  
  inline def apply(fieldName: String): ColumnSortOrder = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], direction = null)
    __obj.asInstanceOf[ColumnSortOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSortOrder] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc_ | desc_): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
  }
}
