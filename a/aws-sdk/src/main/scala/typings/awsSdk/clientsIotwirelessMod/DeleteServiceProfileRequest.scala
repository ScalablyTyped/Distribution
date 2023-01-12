package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceProfileRequest extends StObject {
  
  /**
    * The ID of the resource to delete.
    */
  var Id: ServiceProfileId
}
object DeleteServiceProfileRequest {
  
  inline def apply(Id: ServiceProfileId): DeleteServiceProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ServiceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
