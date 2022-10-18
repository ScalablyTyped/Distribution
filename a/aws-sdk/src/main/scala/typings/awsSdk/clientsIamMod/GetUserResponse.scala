package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserResponse extends StObject {
  
  /**
    * A structure containing details about the IAM user.  Due to a service issue, password last used data does not include password use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects last sign-in dates shown in the IAM console and password last used dates in the IAM credential report, and returned by this operation. If users signed in during the affected time, the password last used date that is returned is the date the user last signed in before May 3, 2018. For users that signed in after May 23, 2018 14:08 PDT, the returned password last used date is accurate. You can use password last used information to identify unused credentials for deletion. For example, you might delete users who did not sign in to Amazon Web Services in the last 90 days. In cases like this, we recommend that you adjust your evaluation window to include dates after May 23, 2018. Alternatively, if your users use access keys to access Amazon Web Services programmatically you can refer to access key last used information because it is accurate for all dates.  
    */
  var User: typings.awsSdk.clientsIamMod.User
}
object GetUserResponse {
  
  inline def apply(User: User): GetUserResponse = {
    val __obj = js.Dynamic.literal(User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
  
  extension [Self <: GetUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
