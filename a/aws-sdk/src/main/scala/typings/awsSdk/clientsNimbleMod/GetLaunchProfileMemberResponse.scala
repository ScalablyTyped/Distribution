package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileMemberResponse extends StObject {
  
  /**
    * The member.
    */
  var member: js.UndefOr[LaunchProfileMembership] = js.undefined
}
object GetLaunchProfileMemberResponse {
  
  inline def apply(): GetLaunchProfileMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchProfileMemberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchProfileMemberResponse] (val x: Self) extends AnyVal {
    
    inline def setMember(value: LaunchProfileMembership): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
  }
}
