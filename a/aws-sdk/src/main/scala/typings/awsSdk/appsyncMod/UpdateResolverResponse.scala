package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverResponse extends StObject {
  
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}
object UpdateResolverResponse {
  
  @scala.inline
  def apply(): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverResponse]
  }
  
  @scala.inline
  implicit class UpdateResolverResponseMutableBuilder[Self <: UpdateResolverResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
