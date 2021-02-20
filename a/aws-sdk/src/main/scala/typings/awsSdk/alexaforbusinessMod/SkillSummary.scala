package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkillSummary extends StObject {
  
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EnablementType] = js.native
  
  /**
    * The ARN of the skill summary.
    */
  var SkillId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillId] = js.native
  
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillName] = js.native
  
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillType] = js.native
  
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}
object SkillSummary {
  
  @scala.inline
  def apply(): SkillSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillSummary]
  }
  
  @scala.inline
  implicit class SkillSummaryMutableBuilder[Self <: SkillSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablementType(value: EnablementType): Self = StObject.set(x, "EnablementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablementTypeUndefined: Self = StObject.set(x, "EnablementType", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillIdUndefined: Self = StObject.set(x, "SkillId", js.undefined)
    
    @scala.inline
    def setSkillName(value: SkillName): Self = StObject.set(x, "SkillName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillNameUndefined: Self = StObject.set(x, "SkillName", js.undefined)
    
    @scala.inline
    def setSkillType(value: SkillType): Self = StObject.set(x, "SkillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillTypeUndefined: Self = StObject.set(x, "SkillType", js.undefined)
    
    @scala.inline
    def setSupportsLinking(value: scala.Boolean): Self = StObject.set(x, "SupportsLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsLinkingUndefined: Self = StObject.set(x, "SupportsLinking", js.undefined)
  }
}
