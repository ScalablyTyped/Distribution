package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineArchiveRule extends StObject {
  
  /**
    * The condition and values for a criterion.
    */
  var filter: FilterCriteriaMap = js.native
  
  /**
    * The name of the rule.
    */
  var ruleName: Name = js.native
}
object InlineArchiveRule {
  
  @scala.inline
  def apply(filter: FilterCriteriaMap, ruleName: Name): InlineArchiveRule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineArchiveRule]
  }
  
  @scala.inline
  implicit class InlineArchiveRuleMutableBuilder[Self <: InlineArchiveRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
