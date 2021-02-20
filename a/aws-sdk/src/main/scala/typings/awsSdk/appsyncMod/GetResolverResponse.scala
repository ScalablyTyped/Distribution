package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverResponse extends StObject {
  
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}
object GetResolverResponse {
  
  @scala.inline
  def apply(): GetResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverResponse]
  }
  
  @scala.inline
  implicit class GetResolverResponseMutableBuilder[Self <: GetResolverResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
