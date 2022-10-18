package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyConfigResult extends StObject {
  
  /**
    * The identifier for this version of the public key configuration.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * A public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.PublicKeyConfig] = js.undefined
}
object GetPublicKeyConfigResult {
  
  inline def apply(): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
  
  extension [Self <: GetPublicKeyConfigResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyConfigUndefined: Self = StObject.set(x, "PublicKeyConfig", js.undefined)
  }
}
