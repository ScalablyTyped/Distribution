package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the result of a goal seek operation. */
@js.native
trait GoalResult extends js.Object {
  
  /** the amount by which the result changed in the last iteration. */
  var Divergence: Double = js.native
  
  /** the resulting value. */
  var Result: Double = js.native
}
object GoalResult {
  
  @scala.inline
  def apply(Divergence: Double, Result: Double): GoalResult = {
    val __obj = js.Dynamic.literal(Divergence = Divergence.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalResult]
  }
  
  @scala.inline
  implicit class GoalResultOps[Self <: GoalResult] (val x: Self) extends AnyVal {
    
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
    def setDivergence(value: Double): Self = this.set("Divergence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
}
