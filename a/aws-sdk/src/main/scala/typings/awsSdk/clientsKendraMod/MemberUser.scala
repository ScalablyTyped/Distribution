package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberUser extends StObject {
  
  /**
    * The identifier of the user you want to map to a group.
    */
  var UserId: typings.awsSdk.clientsKendraMod.UserId
}
object MemberUser {
  
  inline def apply(UserId: UserId): MemberUser = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberUser] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
