package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProfileRequest extends StObject {
  
  /**
    * The ARN of the room profile for which to request details. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}
object GetProfileRequest {
  
  @scala.inline
  def apply(): GetProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileRequest]
  }
  
  @scala.inline
  implicit class GetProfileRequestMutableBuilder[Self <: GetProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
