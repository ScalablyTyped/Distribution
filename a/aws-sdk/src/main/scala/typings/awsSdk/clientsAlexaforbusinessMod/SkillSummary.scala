package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkillSummary extends StObject {
  
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.EnablementType] = js.undefined
  
  /**
    * The ARN of the skill summary.
    */
  var SkillId: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillId] = js.undefined
  
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillName] = js.undefined
  
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillType] = js.undefined
  
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
}
object SkillSummary {
  
  inline def apply(): SkillSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkillSummary] (val x: Self) extends AnyVal {
    
    inline def setEnablementType(value: EnablementType): Self = StObject.set(x, "EnablementType", value.asInstanceOf[js.Any])
    
    inline def setEnablementTypeUndefined: Self = StObject.set(x, "EnablementType", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    inline def setSkillIdUndefined: Self = StObject.set(x, "SkillId", js.undefined)
    
    inline def setSkillName(value: SkillName): Self = StObject.set(x, "SkillName", value.asInstanceOf[js.Any])
    
    inline def setSkillNameUndefined: Self = StObject.set(x, "SkillName", js.undefined)
    
    inline def setSkillType(value: SkillType): Self = StObject.set(x, "SkillType", value.asInstanceOf[js.Any])
    
    inline def setSkillTypeUndefined: Self = StObject.set(x, "SkillType", js.undefined)
    
    inline def setSupportsLinking(value: scala.Boolean): Self = StObject.set(x, "SupportsLinking", value.asInstanceOf[js.Any])
    
    inline def setSupportsLinkingUndefined: Self = StObject.set(x, "SupportsLinking", js.undefined)
  }
}
