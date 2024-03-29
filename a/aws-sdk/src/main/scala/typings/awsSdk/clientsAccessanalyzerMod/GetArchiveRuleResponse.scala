package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArchiveRuleResponse extends StObject {
  
  var archiveRule: ArchiveRuleSummary
}
object GetArchiveRuleResponse {
  
  inline def apply(archiveRule: ArchiveRuleSummary): GetArchiveRuleResponse = {
    val __obj = js.Dynamic.literal(archiveRule = archiveRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetArchiveRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setArchiveRule(value: ArchiveRuleSummary): Self = StObject.set(x, "archiveRule", value.asInstanceOf[js.Any])
  }
}
