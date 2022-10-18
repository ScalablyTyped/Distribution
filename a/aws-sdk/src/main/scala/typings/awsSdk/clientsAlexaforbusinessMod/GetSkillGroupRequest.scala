package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSkillGroupRequest extends StObject {
  
  /**
    * The ARN of the skill group for which to get details. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}
object GetSkillGroupRequest {
  
  inline def apply(): GetSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSkillGroupRequest]
  }
  
  extension [Self <: GetSkillGroupRequest](x: Self) {
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
