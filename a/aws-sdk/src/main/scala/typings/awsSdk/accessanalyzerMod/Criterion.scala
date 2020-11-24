package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Criterion extends js.Object {
  
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
  implicit class CriterionOps[Self <: Criterion] (val x: Self) extends AnyVal {
    
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
    def setContainsVarargs(value: String*): Self = this.set("contains", js.Array(value :_*))
    
    @scala.inline
    def setContains(value: ValueList): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setEqVarargs(value: String*): Self = this.set("eq", js.Array(value :_*))
    
    @scala.inline
    def setEq(value: ValueList): Self = this.set("eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEq: Self = this.set("eq", js.undefined)
    
    @scala.inline
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: String*): Self = this.set("neq", js.Array(value :_*))
    
    @scala.inline
    def setNeq(value: ValueList): Self = this.set("neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeq: Self = this.set("neq", js.undefined)
  }
}
