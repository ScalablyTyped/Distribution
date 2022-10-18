package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePublicKeyResult extends StObject {
  
  /**
    * The identifier of the current version of the public key.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.PublicKey] = js.undefined
}
object UpdatePublicKeyResult {
  
  inline def apply(): UpdatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePublicKeyResult]
  }
  
  extension [Self <: UpdatePublicKeyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
