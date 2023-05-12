package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleObjectID extends StObject {
  
  /**
    * Rule objectId
    */
  val ruleObjectID: String
}
object RuleObjectID {
  
  inline def apply(ruleObjectID: String): RuleObjectID = {
    val __obj = js.Dynamic.literal(ruleObjectID = ruleObjectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleObjectID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleObjectID] (val x: Self) extends AnyVal {
    
    inline def setRuleObjectID(value: String): Self = StObject.set(x, "ruleObjectID", value.asInstanceOf[js.Any])
  }
}
