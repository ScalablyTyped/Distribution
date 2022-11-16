package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphProperty
  extends StObject
     with Accessor {
  
  /**
    * The display name for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#alias)
    */
  var alias: String = js.native
  
  /**
    * Specifies a default value for the object type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#defaultValue)
    */
  var defaultValue: Any = js.native
  
  /**
    * Specifies whether the property is visible by default.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#defaultVisibility)
    */
  var defaultVisibility: Boolean = js.native
  
  /**
    * Specifies whether the property is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#editable)
    */
  var editable: Boolean = js.native
  
  /**
    * Specifies the field type for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#fieldType)
    */
  var fieldType: String = js.native
  
  /**
    * Specifies the geometry type for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#geometryType)
    */
  var geometryType: String = js.native
  
  /**
    * Specifies whether the property has an m-value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#hasM)
    */
  var hasM: Boolean = js.native
  
  /**
    * Specifies whether property has a z-value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#hasZ)
    */
  var hasZ: Boolean = js.native
  
  /**
    * The name of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#name)
    */
  var name: String = js.native
  
  /**
    * Specifies whether the property can be `null`.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#nullable)
    */
  var nullable: Boolean = js.native
  
  /**
    * Specifies whether the property is required.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#required)
    */
  var required: Boolean = js.native
  
  /**
    * Specifies if the property can be searched and included in search results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#searchable)
    */
  var searchable: Boolean = js.native
  
  /**
    * Specifies if the property is system maintained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#systemMaintained)
    */
  var systemMaintained: Boolean = js.native
}
