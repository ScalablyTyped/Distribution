package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverResponse extends StObject {
  
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}
object GetResolverResponse {
  
  inline def apply(): GetResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverResponse]
  }
  
  extension [Self <: GetResolverResponse](x: Self) {
    
    inline def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
