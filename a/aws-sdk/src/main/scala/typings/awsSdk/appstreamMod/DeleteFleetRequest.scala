package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var Name: String
}
object DeleteFleetRequest {
  
  @scala.inline
  def apply(Name: String): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetRequest]
  }
  
  @scala.inline
  implicit class DeleteFleetRequestMutableBuilder[Self <: DeleteFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
