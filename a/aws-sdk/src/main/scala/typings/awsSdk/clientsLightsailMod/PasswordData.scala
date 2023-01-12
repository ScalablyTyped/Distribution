package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordData extends StObject {
  
  /**
    * The encrypted password. Ciphertext will be an empty string if access to your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you use the default key pair (LightsailDefaultKeyPair), the decrypted password will be available in the password field. If you are using a custom key pair, you need to use your own means of decryption. If you change the Administrator password on the instance, Lightsail will continue to return the original ciphertext value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var ciphertext: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the key pair that you used when creating your instance. If no key pair name was specified when creating the instance, Lightsail uses the default key pair (LightsailDefaultKeyPair). If you are using a custom key pair, you need to use your own means of decrypting your password using the ciphertext. Lightsail creates the ciphertext by encrypting your password with the public key part of this key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.undefined
}
object PasswordData {
  
  inline def apply(): PasswordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordData] (val x: Self) extends AnyVal {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
    
    inline def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
    
    inline def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
  }
}
