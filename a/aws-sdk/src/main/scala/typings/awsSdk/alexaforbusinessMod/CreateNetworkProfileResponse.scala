package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkProfileResponse extends StObject {
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
}
object CreateNetworkProfileResponse {
  
  @scala.inline
  def apply(): CreateNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkProfileResponse]
  }
  
  @scala.inline
  implicit class CreateNetworkProfileResponseMutableBuilder[Self <: CreateNetworkProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
  }
}
