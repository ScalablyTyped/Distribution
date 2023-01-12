package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserProfileResult extends StObject {
  
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
}
object CreateUserProfileResult {
  
  inline def apply(): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserProfileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserProfileResult] (val x: Self) extends AnyVal {
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
  }
}
