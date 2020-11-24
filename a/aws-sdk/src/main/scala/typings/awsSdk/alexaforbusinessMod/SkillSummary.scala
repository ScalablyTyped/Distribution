package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkillSummary extends js.Object {
  
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
  implicit class SkillSummaryOps[Self <: SkillSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnablementType(value: EnablementType): Self = this.set("EnablementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablementType: Self = this.set("EnablementType", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillId: Self = this.set("SkillId", js.undefined)
    
    @scala.inline
    def setSkillName(value: SkillName): Self = this.set("SkillName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillName: Self = this.set("SkillName", js.undefined)
    
    @scala.inline
    def setSkillType(value: SkillType): Self = this.set("SkillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillType: Self = this.set("SkillType", js.undefined)
    
    @scala.inline
    def setSupportsLinking(value: scala.Boolean): Self = this.set("SupportsLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsLinking: Self = this.set("SupportsLinking", js.undefined)
  }
}
