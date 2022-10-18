package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * Get the ID for the field-level encryption profile information.
    */
  var Id: String
}
object GetFieldLevelEncryptionProfileRequest {
  
  inline def apply(Id: String): GetFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
  }
  
  extension [Self <: GetFieldLevelEncryptionProfileRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
