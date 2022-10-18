package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceShareResponse extends StObject {
  
  /**
    * The idempotency identifier associated with this request. If you want to repeat the same operation in an idempotent manner then you must include this value in the clientToken request parameter of that later call. All other parameters must also have the same values that you used in the first call.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object with information about the new resource share.
    */
  var resourceShare: js.UndefOr[ResourceShare] = js.undefined
}
object CreateResourceShareResponse {
  
  inline def apply(): CreateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceShareResponse]
  }
  
  extension [Self <: CreateResourceShareResponse](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShare(value: ResourceShare): Self = StObject.set(x, "resourceShare", value.asInstanceOf[js.Any])
    
    inline def setResourceShareUndefined: Self = StObject.set(x, "resourceShare", js.undefined)
  }
}
