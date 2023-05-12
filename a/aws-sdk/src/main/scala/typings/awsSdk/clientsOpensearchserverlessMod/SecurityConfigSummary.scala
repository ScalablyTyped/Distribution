package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigSummary extends StObject {
  
  /**
    * The version of the security configuration.
    */
  var configVersion: js.UndefOr[PolicyVersion] = js.undefined
  
  /**
    * The Epoch time when the security configuration was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The description of the security configuration.
    */
  var description: js.UndefOr[ConfigDescription] = js.undefined
  
  /**
    * The unique identifier of the security configuration.
    */
  var id: js.UndefOr[SecurityConfigId] = js.undefined
  
  /**
    * The timestamp of when the configuration was last modified.
    */
  var lastModifiedDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The type of security configuration.
    */
  var `type`: js.UndefOr[SecurityConfigType] = js.undefined
}
object SecurityConfigSummary {
  
  inline def apply(): SecurityConfigSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityConfigSummary] (val x: Self) extends AnyVal {
    
    inline def setConfigVersion(value: PolicyVersion): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigVersionUndefined: Self = StObject.set(x, "configVersion", js.undefined)
    
    inline def setCreatedDate(value: Long): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: ConfigDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SecurityConfigId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastModifiedDate(value: Long): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setType(value: SecurityConfigType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
