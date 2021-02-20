package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResolverResponse extends StObject {
  
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}
object CreateResolverResponse {
  
  @scala.inline
  def apply(): CreateResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverResponse]
  }
  
  @scala.inline
  implicit class CreateResolverResponseMutableBuilder[Self <: CreateResolverResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolver(value: Resolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
  }
}
