package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSecretVerifierConfigType extends StObject {
  
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.undefined
  
  /**
    * The salt 
    */
  var Salt: js.UndefOr[StringType] = js.undefined
}
object DeviceSecretVerifierConfigType {
  
  inline def apply(): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceSecretVerifierConfigType] (val x: Self) extends AnyVal {
    
    inline def setPasswordVerifier(value: StringType): Self = StObject.set(x, "PasswordVerifier", value.asInstanceOf[js.Any])
    
    inline def setPasswordVerifierUndefined: Self = StObject.set(x, "PasswordVerifier", js.undefined)
    
    inline def setSalt(value: StringType): Self = StObject.set(x, "Salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "Salt", js.undefined)
  }
}
