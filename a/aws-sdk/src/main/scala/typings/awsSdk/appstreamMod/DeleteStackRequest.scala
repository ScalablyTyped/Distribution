package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackRequest extends StObject {
  
  /**
    * The name of the stack.
    */
  var Name: String
}
object DeleteStackRequest {
  
  @scala.inline
  def apply(Name: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackRequest]
  }
  
  @scala.inline
  implicit class DeleteStackRequestMutableBuilder[Self <: DeleteStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
