package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArchiveRuleResponse extends StObject {
  
  var archiveRule: ArchiveRuleSummary
}
object GetArchiveRuleResponse {
  
  @scala.inline
  def apply(archiveRule: ArchiveRuleSummary): GetArchiveRuleResponse = {
    val __obj = js.Dynamic.literal(archiveRule = archiveRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleResponse]
  }
  
  @scala.inline
  implicit class GetArchiveRuleResponseMutableBuilder[Self <: GetArchiveRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveRule(value: ArchiveRuleSummary): Self = StObject.set(x, "archiveRule", value.asInstanceOf[js.Any])
  }
}
