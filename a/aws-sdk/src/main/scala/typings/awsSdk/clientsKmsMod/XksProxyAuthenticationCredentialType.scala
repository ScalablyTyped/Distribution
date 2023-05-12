package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XksProxyAuthenticationCredentialType extends StObject {
  
  /**
    * A unique identifier for the raw secret access key.
    */
  var AccessKeyId: XksProxyAuthenticationAccessKeyIdType
  
  /**
    * A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and =.
    */
  var RawSecretAccessKey: XksProxyAuthenticationRawSecretAccessKeyType
}
object XksProxyAuthenticationCredentialType {
  
  inline def apply(
    AccessKeyId: XksProxyAuthenticationAccessKeyIdType,
    RawSecretAccessKey: XksProxyAuthenticationRawSecretAccessKeyType
  ): XksProxyAuthenticationCredentialType = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], RawSecretAccessKey = RawSecretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XksProxyAuthenticationCredentialType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XksProxyAuthenticationCredentialType] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: XksProxyAuthenticationAccessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setRawSecretAccessKey(value: XksProxyAuthenticationRawSecretAccessKeyType): Self = StObject.set(x, "RawSecretAccessKey", value.asInstanceOf[js.Any])
  }
}
