package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionProfileConfigRequest extends StObject {
  
  /**
    * Get the ID for the field-level encryption profile configuration information.
    */
  var Id: String
}
object GetFieldLevelEncryptionProfileConfigRequest {
  
  inline def apply(Id: String): GetFieldLevelEncryptionProfileConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFieldLevelEncryptionProfileConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
