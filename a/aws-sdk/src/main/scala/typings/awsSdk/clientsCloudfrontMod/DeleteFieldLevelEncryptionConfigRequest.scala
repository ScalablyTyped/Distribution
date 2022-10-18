package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFieldLevelEncryptionConfigRequest extends StObject {
  
  /**
    * The ID of the configuration you want to delete from CloudFront.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteFieldLevelEncryptionConfigRequest {
  
  inline def apply(Id: String): DeleteFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
  }
  
  extension [Self <: DeleteFieldLevelEncryptionConfigRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
