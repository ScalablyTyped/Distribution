package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArchiveRulesResponse extends StObject {
  
  /**
    * A list of archive rules created for the specified analyzer.
    */
  var archiveRules: ArchiveRulesList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListArchiveRulesResponse {
  
  inline def apply(archiveRules: ArchiveRulesList): ListArchiveRulesResponse = {
    val __obj = js.Dynamic.literal(archiveRules = archiveRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListArchiveRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setArchiveRules(value: ArchiveRulesList): Self = StObject.set(x, "archiveRules", value.asInstanceOf[js.Any])
    
    inline def setArchiveRulesVarargs(value: ArchiveRuleSummary*): Self = StObject.set(x, "archiveRules", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
