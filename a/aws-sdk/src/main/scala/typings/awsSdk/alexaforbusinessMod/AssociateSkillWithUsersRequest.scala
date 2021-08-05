package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSkillWithUsersRequest extends StObject {
  
  /**
    * The private skill ID you want to make available to enrolled users.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
}
object AssociateSkillWithUsersRequest {
  
  inline def apply(SkillId: SkillId): AssociateSkillWithUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillWithUsersRequest]
  }
  
  extension [Self <: AssociateSkillWithUsersRequest](x: Self) {
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
