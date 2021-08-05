package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileRequest extends StObject {
  
  /**
    * The ARN of the room profile to delete. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
}
object DeleteProfileRequest {
  
  inline def apply(): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  
  extension [Self <: DeleteProfileRequest](x: Self) {
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
