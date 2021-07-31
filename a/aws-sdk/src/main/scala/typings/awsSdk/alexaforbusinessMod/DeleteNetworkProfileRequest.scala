package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn
}
object DeleteNetworkProfileRequest {
  
  @scala.inline
  def apply(NetworkProfileArn: Arn): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteNetworkProfileRequestMutableBuilder[Self <: DeleteNetworkProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
  }
}
