package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.UUID_RFC_4122
import typings.arcgisJsApi.arcgisJsApiStrings.esriUUIDESRI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelIdentifierInfo extends StObject {
  
  /**
  		 * Information on how the unique identifier is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
  		 */
  var identifierGenerationInfo: Any
  
  /**
  		 * Information on the type and format of the universally unique identifier
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
  		 */
  var identifierMappingInfo: DataModelIdentifierInfoIdentifierMappingInfo
  
  /**
  		 * Information on the format of the unique identifier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
  		 */
  var uuidMethodHint: esriUUIDESRI | UUID_RFC_4122
}
object DataModelIdentifierInfo {
  
  inline def apply(
    identifierGenerationInfo: Any,
    identifierMappingInfo: DataModelIdentifierInfoIdentifierMappingInfo,
    uuidMethodHint: esriUUIDESRI | UUID_RFC_4122
  ): DataModelIdentifierInfo = {
    val __obj = js.Dynamic.literal(identifierGenerationInfo = identifierGenerationInfo.asInstanceOf[js.Any], identifierMappingInfo = identifierMappingInfo.asInstanceOf[js.Any], uuidMethodHint = uuidMethodHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataModelIdentifierInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelIdentifierInfo] (val x: Self) extends AnyVal {
    
    inline def setIdentifierGenerationInfo(value: Any): Self = StObject.set(x, "identifierGenerationInfo", value.asInstanceOf[js.Any])
    
    inline def setIdentifierMappingInfo(value: DataModelIdentifierInfoIdentifierMappingInfo): Self = StObject.set(x, "identifierMappingInfo", value.asInstanceOf[js.Any])
    
    inline def setUuidMethodHint(value: esriUUIDESRI | UUID_RFC_4122): Self = StObject.set(x, "uuidMethodHint", value.asInstanceOf[js.Any])
  }
}
