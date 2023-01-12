package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /**
    * The date and time when the public key was uploaded.
    */
  var CreatedTime: js.Date
  
  /**
    * The identifier of the public key.
    */
  var Id: String
  
  /**
    * Configuration information about a public key that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  var PublicKeyConfig: typings.awsSdk.clientsCloudfrontMod.PublicKeyConfig
}
object PublicKey {
  
  inline def apply(CreatedTime: js.Date, Id: String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
  }
}
