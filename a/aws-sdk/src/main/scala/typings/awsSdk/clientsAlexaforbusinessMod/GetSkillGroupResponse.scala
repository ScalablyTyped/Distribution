package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSkillGroupResponse extends StObject {
  
  /**
    * The details of the skill group requested. Required.
    */
  var SkillGroup: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillGroup] = js.undefined
}
object GetSkillGroupResponse {
  
  inline def apply(): GetSkillGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSkillGroupResponse]
  }
  
  extension [Self <: GetSkillGroupResponse](x: Self) {
    
    inline def setSkillGroup(value: SkillGroup): Self = StObject.set(x, "SkillGroup", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupUndefined: Self = StObject.set(x, "SkillGroup", js.undefined)
  }
}
