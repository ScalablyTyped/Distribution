package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnalyzerRequest extends StObject {
  
  /**
    * The name of the analyzer to create.
    */
  var analyzerName: Name = js.native
  
  /**
    * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the criteria you define for the rule.
    */
  var archiveRules: js.UndefOr[InlineArchiveRulesList] = js.native
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The tags to apply to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * The type of analyzer to create. Only ACCOUNT analyzers are supported. You can create only one analyzer per account per Region.
    */
  var `type`: Type = js.native
}
object CreateAnalyzerRequest {
  
  @scala.inline
  def apply(analyzerName: Name, `type`: Type): CreateAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalyzerRequest]
  }
  
  @scala.inline
  implicit class CreateAnalyzerRequestMutableBuilder[Self <: CreateAnalyzerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveRules(value: InlineArchiveRulesList): Self = StObject.set(x, "archiveRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveRulesUndefined: Self = StObject.set(x, "archiveRules", js.undefined)
    
    @scala.inline
    def setArchiveRulesVarargs(value: InlineArchiveRule*): Self = StObject.set(x, "archiveRules", js.Array(value :_*))
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
