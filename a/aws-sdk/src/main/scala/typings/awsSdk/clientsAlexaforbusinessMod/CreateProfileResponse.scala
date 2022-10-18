package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileResponse extends StObject {
  
  /**
    * The ARN of the newly created room profile in the response.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
}
object CreateProfileResponse {
  
  inline def apply(): CreateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProfileResponse]
  }
  
  extension [Self <: CreateProfileResponse](x: Self) {
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
  }
}
