package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkillsStoreSkill extends js.Object {
  
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IconUrl] = js.native
  
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SampleUtterances] = js.native
  
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ShortDescription] = js.native
  
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillDetails] = js.native
  
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillId] = js.native
  
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillName] = js.native
  
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}
object SkillsStoreSkill {
  
  @scala.inline
  def apply(): SkillsStoreSkill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillsStoreSkill]
  }
  
  @scala.inline
  implicit class SkillsStoreSkillOps[Self <: SkillsStoreSkill] (val x: Self) extends AnyVal {
    
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
    def setIconUrl(value: IconUrl): Self = this.set("IconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("IconUrl", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = this.set("SampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSampleUtterances(value: SampleUtterances): Self = this.set("SampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleUtterances: Self = this.set("SampleUtterances", js.undefined)
    
    @scala.inline
    def setShortDescription(value: ShortDescription): Self = this.set("ShortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDescription: Self = this.set("ShortDescription", js.undefined)
    
    @scala.inline
    def setSkillDetails(value: SkillDetails): Self = this.set("SkillDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillDetails: Self = this.set("SkillDetails", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = this.set("SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillId: Self = this.set("SkillId", js.undefined)
    
    @scala.inline
    def setSkillName(value: SkillName): Self = this.set("SkillName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkillName: Self = this.set("SkillName", js.undefined)
    
    @scala.inline
    def setSupportsLinking(value: scala.Boolean): Self = this.set("SupportsLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsLinking: Self = this.set("SupportsLinking", js.undefined)
  }
}
