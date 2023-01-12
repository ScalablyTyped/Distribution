package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfilesRequest extends StObject {
  
  /**
    * An array of IAM or federated user ARNs that identify the users to be described.
    */
  var IamUserArns: js.UndefOr[Strings] = js.undefined
}
object DescribeUserProfilesRequest {
  
  inline def apply(): DescribeUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserProfilesRequest] (val x: Self) extends AnyVal {
    
    inline def setIamUserArns(value: Strings): Self = StObject.set(x, "IamUserArns", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnsUndefined: Self = StObject.set(x, "IamUserArns", js.undefined)
    
    inline def setIamUserArnsVarargs(value: String*): Self = StObject.set(x, "IamUserArns", js.Array(value*))
  }
}
