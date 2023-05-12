package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier extends StObject {
  
  /**
    * The name of the unique identifier property for all records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#identifierInfo)
    */
  var identifierPropertyName: String
}
object DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier {
  
  inline def apply(identifierPropertyName: String): DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier = {
    val __obj = js.Dynamic.literal(identifierPropertyName = identifierPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelIdentifierInfoIdentifierMappingInfoUniformPropertyIdentifier] (val x: Self) extends AnyVal {
    
    inline def setIdentifierPropertyName(value: String): Self = StObject.set(x, "identifierPropertyName", value.asInstanceOf[js.Any])
  }
}
