package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnalyzerRequest extends js.Object {
  
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
  implicit class CreateAnalyzerRequestOps[Self <: CreateAnalyzerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = this.set("analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveRulesVarargs(value: InlineArchiveRule*): Self = this.set("archiveRules", js.Array(value :_*))
    
    @scala.inline
    def setArchiveRules(value: InlineArchiveRulesList): Self = this.set("archiveRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveRules: Self = this.set("archiveRules", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
