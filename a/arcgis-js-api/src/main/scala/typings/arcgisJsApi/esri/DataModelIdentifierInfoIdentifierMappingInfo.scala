package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.esriIdentifierInfoTypeDatabaseNative
import typings.arcgisJsApi.arcgisJsApiStrings.esriIdentifierInfoTypeUniformProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelIdentifierInfoIdentifierMappingInfo extends StObject {
  
  /**
    * Properties of database native identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
    */
  var databaseNativeIdentifier: Any
  
  /**
    * Indicates the type of the ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
    */
  var identifierInfoType: esriIdentifierInfoTypeUniformProperty | esriIdentifierInfoTypeDatabaseNative
  
  /**
    * Properties of the user defined unique identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
    */
  var uniformPropertyIdentifier: DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier
}
object DataModelIdentifierInfoIdentifierMappingInfo {
  
  inline def apply(
    databaseNativeIdentifier: Any,
    identifierInfoType: esriIdentifierInfoTypeUniformProperty | esriIdentifierInfoTypeDatabaseNative,
    uniformPropertyIdentifier: DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier
  ): DataModelIdentifierInfoIdentifierMappingInfo = {
    val __obj = js.Dynamic.literal(databaseNativeIdentifier = databaseNativeIdentifier.asInstanceOf[js.Any], identifierInfoType = identifierInfoType.asInstanceOf[js.Any], uniformPropertyIdentifier = uniformPropertyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataModelIdentifierInfoIdentifierMappingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelIdentifierInfoIdentifierMappingInfo] (val x: Self) extends AnyVal {
    
    inline def setDatabaseNativeIdentifier(value: Any): Self = StObject.set(x, "databaseNativeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierInfoType(value: esriIdentifierInfoTypeUniformProperty | esriIdentifierInfoTypeDatabaseNative): Self = StObject.set(x, "identifierInfoType", value.asInstanceOf[js.Any])
    
    inline def setUniformPropertyIdentifier(value: DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier): Self = StObject.set(x, "uniformPropertyIdentifier", value.asInstanceOf[js.Any])
  }
}
