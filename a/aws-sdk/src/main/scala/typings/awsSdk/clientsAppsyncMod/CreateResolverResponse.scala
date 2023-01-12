package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverResponse extends StObject {
  
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}
object CreateResolverResponse {
  
  inline def apply(): CreateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResolverResponse] (val x: Self) extends AnyVal {
    
    inline def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
