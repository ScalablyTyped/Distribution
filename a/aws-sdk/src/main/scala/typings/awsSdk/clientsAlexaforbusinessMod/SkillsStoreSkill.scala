package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkillsStoreSkill extends StObject {
  
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.IconUrl] = js.undefined
  
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SampleUtterances] = js.undefined
  
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ShortDescription] = js.undefined
  
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillDetails] = js.undefined
  
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillId] = js.undefined
  
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.SkillName] = js.undefined
  
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
}
object SkillsStoreSkill {
  
  inline def apply(): SkillsStoreSkill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillsStoreSkill]
  }
  
  extension [Self <: SkillsStoreSkill](x: Self) {
    
    inline def setIconUrl(value: IconUrl): Self = StObject.set(x, "IconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "IconUrl", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterances): Self = StObject.set(x, "SampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "SampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "SampleUtterances", js.Array(value*))
    
    inline def setShortDescription(value: ShortDescription): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "ShortDescription", js.undefined)
    
    inline def setSkillDetails(value: SkillDetails): Self = StObject.set(x, "SkillDetails", value.asInstanceOf[js.Any])
    
    inline def setSkillDetailsUndefined: Self = StObject.set(x, "SkillDetails", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    inline def setSkillIdUndefined: Self = StObject.set(x, "SkillId", js.undefined)
    
    inline def setSkillName(value: SkillName): Self = StObject.set(x, "SkillName", value.asInstanceOf[js.Any])
    
    inline def setSkillNameUndefined: Self = StObject.set(x, "SkillName", js.undefined)
    
    inline def setSupportsLinking(value: scala.Boolean): Self = StObject.set(x, "SupportsLinking", value.asInstanceOf[js.Any])
    
    inline def setSupportsLinkingUndefined: Self = StObject.set(x, "SupportsLinking", js.undefined)
  }
}
