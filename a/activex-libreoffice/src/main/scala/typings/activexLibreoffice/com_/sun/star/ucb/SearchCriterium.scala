package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a criterion describing how an object must match some rules that specify (part of) a search. */
@js.native
trait SearchCriterium extends js.Object {
  
  /** a number of rule terms. */
  var Terms: SafeArray[RuleTerm] = js.native
}
object SearchCriterium {
  
  @scala.inline
  def apply(Terms: SafeArray[RuleTerm]): SearchCriterium = {
    val __obj = js.Dynamic.literal(Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriterium]
  }
  
  @scala.inline
  implicit class SearchCriteriumOps[Self <: SearchCriterium] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTerms(value: SafeArray[RuleTerm]): Self = this.set("Terms", value.asInstanceOf[js.Any])
  }
}
