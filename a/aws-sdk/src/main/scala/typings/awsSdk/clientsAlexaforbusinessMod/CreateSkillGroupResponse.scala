package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSkillGroupResponse extends StObject {
  
  /**
    * The ARN of the newly created skill group in the response.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}
object CreateSkillGroupResponse {
  
  inline def apply(): CreateSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSkillGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSkillGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
