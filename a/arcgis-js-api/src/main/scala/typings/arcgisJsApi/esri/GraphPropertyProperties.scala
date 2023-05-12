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

trait GraphPropertyProperties extends StObject {
  
  /**
    * The display name for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#alias)
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a default value for the object type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#defaultValue)
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether the property is visible by default.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#defaultVisibility)
    */
  var defaultVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the property is editable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field type for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#fieldType)
    */
  var fieldType: js.UndefOr[
    esriFieldTypeSmallInteger | esriFieldTypeInteger | esriFieldTypeSingle | esriFieldTypeDouble | esriFieldTypeString | esriFieldTypeDate | esriFieldTypeOID | esriFieldTypeGeometry | esriFieldTypeBlob | esriFieldTypeRaster | esriFieldTypeGUID | esriFieldTypeGlobalID | esriFieldTypeXML | esriFieldTypeBigInteger
  ] = js.undefined
  
  /**
    * Specifies the geometry type for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#geometryType)
    */
  var geometryType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the property has an m-value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#hasM)
    */
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether property has a z-value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#hasZ)
    */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the property can be `null`.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#nullable)
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the property is required.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#required)
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the role of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#role)
    */
  var role: js.UndefOr[
    esriGraphPropertyRegular | esriGraphPropertyDocumentName | esriGraphPropertyDocumentTitle | esriGraphPropertyDocumentUrl | esriGraphPropertyDocumentText | esriGraphPropertyDocumentKeywords | esriGraphPropertyDocumentContentType | esriGraphPropertyDocumentMetadata | esriGraphPropertyDocumentFileExtension
  ] = js.undefined
  
  /**
    * Specifies if the property is system maintained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html#systemMaintained)
    */
  var systemMaintained: js.UndefOr[Boolean] = js.undefined
}
object GraphPropertyProperties {
  
  inline def apply(): GraphPropertyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphPropertyProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphPropertyProperties] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultVisibility(value: Boolean): Self = StObject.set(x, "defaultVisibility", value.asInstanceOf[js.Any])
    
    inline def setDefaultVisibilityUndefined: Self = StObject.set(x, "defaultVisibility", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFieldType(
      value: esriFieldTypeSmallInteger | esriFieldTypeInteger | esriFieldTypeSingle | esriFieldTypeDouble | esriFieldTypeString | esriFieldTypeDate | esriFieldTypeOID | esriFieldTypeGeometry | esriFieldTypeBlob | esriFieldTypeRaster | esriFieldTypeGUID | esriFieldTypeGlobalID | esriFieldTypeXML | esriFieldTypeBigInteger
    ): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setFieldTypeUndefined: Self = StObject.set(x, "fieldType", js.undefined)
    
    inline def setGeometryType(value: String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRole(
      value: esriGraphPropertyRegular | esriGraphPropertyDocumentName | esriGraphPropertyDocumentTitle | esriGraphPropertyDocumentUrl | esriGraphPropertyDocumentText | esriGraphPropertyDocumentKeywords | esriGraphPropertyDocumentContentType | esriGraphPropertyDocumentMetadata | esriGraphPropertyDocumentFileExtension
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSystemMaintained(value: Boolean): Self = StObject.set(x, "systemMaintained", value.asInstanceOf[js.Any])
    
    inline def setSystemMaintainedUndefined: Self = StObject.set(x, "systemMaintained", js.undefined)
  }
}
