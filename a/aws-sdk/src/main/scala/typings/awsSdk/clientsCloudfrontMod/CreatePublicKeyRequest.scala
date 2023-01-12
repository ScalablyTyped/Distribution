package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublicKeyRequest extends StObject {
  
  /**
    * A CloudFront public key configuration.
    */
  var PublicKeyConfig: typings.awsSdk.clientsCloudfrontMod.PublicKeyConfig
}
object CreatePublicKeyRequest {
  
  inline def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePublicKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
  }
}
