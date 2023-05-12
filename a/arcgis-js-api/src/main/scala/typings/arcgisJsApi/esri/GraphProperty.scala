package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeBigInteger
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeBlob
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeDate
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeDouble
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeGUID
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeGeometry
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeGlobalID
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeInteger
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeOID
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeRaster
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeSingle
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeSmallInteger
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeString
import typings.arcgisJsApi.arcgisJsApiStrings.esriFieldTypeXML
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentContentType
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentFileExtension
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentKeywords
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentMetadata
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentName
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentText
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentTitle
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyDocumentUrl
import typings.arcgisJsApi.arcgisJsApiStrings.esriGraphPropertyRegular
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
  var fieldType: esriFieldTypeSmallInteger | esriFieldTypeInteger | esriFieldTypeSingle | esriFieldTypeDouble | esriFieldTypeString | esriFieldTypeDate | esriFieldTypeOID | esriFieldTypeGeometry | esriFieldTypeBlob | esriFieldTypeRaster | esriFieldTypeGUID | esriFieldTypeGlobalID | esriFieldTypeXML | esriFieldTypeBigInteger = js.native
  
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
    * Specifies the role of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#role)
    */
  var role: esriGraphPropertyRegular | esriGraphPropertyDocumentName | esriGraphPropertyDocumentTitle | esriGraphPropertyDocumentUrl | esriGraphPropertyDocumentText | esriGraphPropertyDocumentKeywords | esriGraphPropertyDocumentContentType | esriGraphPropertyDocumentMetadata | esriGraphPropertyDocumentFileExtension = js.native
  
  /**
    * Specifies if the property is system maintained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#systemMaintained)
    */
  var systemMaintained: Boolean = js.native
}
