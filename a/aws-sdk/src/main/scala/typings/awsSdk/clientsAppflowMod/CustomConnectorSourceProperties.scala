package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConnectorSourceProperties extends StObject {
  
  /**
    * Custom properties that are required to use the custom connector as a source.
    */
  var customProperties: js.UndefOr[CustomProperties] = js.undefined
  
  /**
    * The entity specified in the custom connector as a source in the flow.
    */
  var entityName: EntityName
}
object CustomConnectorSourceProperties {
  
  inline def apply(entityName: EntityName): CustomConnectorSourceProperties = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomConnectorSourceProperties]
  }
  
  extension [Self <: CustomConnectorSourceProperties](x: Self) {
    
    inline def setCustomProperties(value: CustomProperties): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
  }
}
