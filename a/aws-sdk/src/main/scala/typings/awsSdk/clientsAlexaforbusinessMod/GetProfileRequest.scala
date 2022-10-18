package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProfileRequest extends StObject {
  
  /**
    * The ARN of the room profile for which to request details. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
}
object GetProfileRequest {
  
  inline def apply(): GetProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileRequest]
  }
  
  extension [Self <: GetProfileRequest](x: Self) {
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
