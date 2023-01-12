package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * The access key identifier.
    */
  var accessKeyId: js.UndefOr[stringValueLength1to255] = js.undefined
  
  /**
    * The access key.
    */
  var secretAccessKey: js.UndefOr[stringValueMaxLength1000] = js.undefined
  
  /**
    * The session token.
    */
  var sessionToken: js.UndefOr[stringValueMaxLength1000] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: stringValueLength1to255): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setSecretAccessKey(value: stringValueMaxLength1000): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSessionToken(value: stringValueMaxLength1000): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
