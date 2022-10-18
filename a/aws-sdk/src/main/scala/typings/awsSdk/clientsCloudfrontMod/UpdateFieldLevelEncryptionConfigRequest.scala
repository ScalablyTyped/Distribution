package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFieldLevelEncryptionConfigRequest extends StObject {
  
  /**
    * Request to update a field-level encryption configuration. 
    */
  var FieldLevelEncryptionConfig: typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig
  
  /**
    * The ID of the configuration you want to update.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object UpdateFieldLevelEncryptionConfigRequest {
  
  inline def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String): UpdateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
  }
  
  extension [Self <: UpdateFieldLevelEncryptionConfigRequest](x: Self) {
    
    inline def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = StObject.set(x, "FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
