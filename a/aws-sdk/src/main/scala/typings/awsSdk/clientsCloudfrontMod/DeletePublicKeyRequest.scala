package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublicKeyRequest extends StObject {
  
  /**
    * The ID of the public key you want to remove from CloudFront.
    */
  var Id: String
  
  /**
    * The value of the ETag header that you received when retrieving the public key identity to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeletePublicKeyRequest {
  
  inline def apply(Id: String): DeletePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicKeyRequest]
  }
  
  extension [Self <: DeletePublicKeyRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
