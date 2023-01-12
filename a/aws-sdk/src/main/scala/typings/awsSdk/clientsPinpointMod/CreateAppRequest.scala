package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  var CreateApplicationRequest: typings.awsSdk.clientsPinpointMod.CreateApplicationRequest
}
object CreateAppRequest {
  
  inline def apply(CreateApplicationRequest: CreateApplicationRequest): CreateAppRequest = {
    val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateApplicationRequest(value: CreateApplicationRequest): Self = StObject.set(x, "CreateApplicationRequest", value.asInstanceOf[js.Any])
  }
}
