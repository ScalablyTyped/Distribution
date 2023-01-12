package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveSkillRequest extends StObject {
  
  /**
    * The unique identifier of the skill.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object ApproveSkillRequest {
  
  inline def apply(SkillId: SkillId): ApproveSkillRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproveSkillRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApproveSkillRequest] (val x: Self) extends AnyVal {
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
