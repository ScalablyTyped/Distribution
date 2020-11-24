package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldColumn
  extends Accessor
     with Column {
  
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#alias)
    */
  val alias: String = js.native
  
  /**
    * The field configuration for the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#config)
    */
  var config: FieldColumnConfig = js.native
  
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#defaultValue)
    */
  val defaultValue: Double | String | js.Any = js.native
  
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#description)
    */
  val description: String = js.native
  
  /**
    * Controls the sort order of the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#direction)
    */
  var direction: asc_ | desc_ | js.Any = js.native
  
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#editable)
    */
  val editable: Boolean = js.native
  
  /**
    * The [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) associated with this column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#field)
    */
  var field: Field = js.native
  
  /**
    * If applicable, the associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) tied to the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#layer)
    */
  var layer: FeatureLayer = js.native
  
  /**
    * Restricts the input length for the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#maxLength)
    */
  val maxLength: Double = js.native
  
  /**
    * The [Object](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig) used to customize the column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#menuConfig)
    */
  val menuConfig: ButtonMenuConfig = js.native
  
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#name)
    */
  val name: String = js.native
  
  /**
    * Indicates if the field can accept `null` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#nullable)
    */
  val nullable: Boolean = js.native
  
  /**
    * Indicates whether the field is required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#required)
    */
  val required: Boolean = js.native
  
  /**
    * Indicates whether the field is sortable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#sortable)
    */
  val sortable: Boolean = js.native
}
