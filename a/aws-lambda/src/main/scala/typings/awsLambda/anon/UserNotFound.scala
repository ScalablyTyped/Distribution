package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserNotFound extends StObject {
  
  var userAttributes: StringMap
  
  var userNotFound: js.UndefOr[Boolean] = js.undefined
  
  var validationData: js.UndefOr[StringMap] = js.undefined
}
object UserNotFound {
  
  inline def apply(userAttributes: StringMap): UserNotFound = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotFound]
  }
  
  extension [Self <: UserNotFound](x: Self) {
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    inline def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
    
    inline def setValidationData(value: StringMap): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
    
    inline def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
  }
}
