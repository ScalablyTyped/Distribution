package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfilesResult extends StObject {
  
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[typings.awsSdk.clientsOpsworksMod.UserProfiles] = js.undefined
}
object DescribeUserProfilesResult {
  
  inline def apply(): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserProfilesResult] (val x: Self) extends AnyVal {
    
    inline def setUserProfiles(value: UserProfiles): Self = StObject.set(x, "UserProfiles", value.asInstanceOf[js.Any])
    
    inline def setUserProfilesUndefined: Self = StObject.set(x, "UserProfiles", js.undefined)
    
    inline def setUserProfilesVarargs(value: UserProfile*): Self = StObject.set(x, "UserProfiles", js.Array(value*))
  }
}
