package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Criterion extends StObject {
  
  /**
    * A "contains" operator to match for the filter used to create the rule.
    */
  var contains: js.UndefOr[ValueList] = js.native
  
  /**
    * An "equals" operator to match for the filter used to create the rule.
    */
  @JSName("eq")
  var eq_FCriterion: js.UndefOr[ValueList] = js.native
  
  /**
    * An "exists" operator to match for the filter used to create the rule. 
    */
  var exists: js.UndefOr[Boolean] = js.native
  
  /**
    * A "not equals" operator to match for the filter used to create the rule.
    */
  var neq: js.UndefOr[ValueList] = js.native
}
object Criterion {
  
  @scala.inline
  def apply(): Criterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Criterion]
  }
  
  @scala.inline
  implicit class CriterionMutableBuilder[Self <: Criterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: ValueList): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setContainsVarargs(value: String*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setEq_(value: ValueList): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    @scala.inline
    def setEq_Varargs(value: String*): Self = StObject.set(x, "eq", js.Array(value :_*))
    
    @scala.inline
    def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    @scala.inline
    def setNeq(value: ValueList): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: String*): Self = StObject.set(x, "neq", js.Array(value :_*))
  }
}
