package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProfileRequest extends StObject {
  
  /**
    * The ARN of the room profile to delete. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}
object DeleteProfileRequest {
  
  @scala.inline
  def apply(): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteProfileRequestMutableBuilder[Self <: DeleteProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
