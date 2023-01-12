package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSkillFromUsersRequest extends StObject {
  
  /**
    *  The private skill ID you want to make unavailable for enrolled users.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object DisassociateSkillFromUsersRequest {
  
  inline def apply(SkillId: SkillId): DisassociateSkillFromUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateSkillFromUsersRequest] (val x: Self) extends AnyVal {
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
