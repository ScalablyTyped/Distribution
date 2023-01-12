package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * Request to update a field-level encryption profile. 
    */
  var FieldLevelEncryptionProfileConfig: typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionProfileConfig
  
  /**
    * The ID of the field-level encryption profile request. 
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the profile identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object UpdateFieldLevelEncryptionProfileRequest {
  
  inline def apply(FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig, Id: String): UpdateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFieldLevelEncryptionProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setFieldLevelEncryptionProfileConfig(value: FieldLevelEncryptionProfileConfig): Self = StObject.set(x, "FieldLevelEncryptionProfileConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
